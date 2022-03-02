package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.beans.Account;
import com.revature.beans.Account.AccountType;
import com.revature.beans.Transaction;
import com.revature.beans.Transaction.TransactionType;
import com.revature.beans.User;
import com.revature.beans.User.UserType;
import com.revature.dao.AccountDao;
import com.revature.dao.AccountDaoFile;
import com.revature.dao.TransactionDao;
import com.revature.dao.TransactionDaoFile;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoFile;

/**
 * These tests use the file DAO implementation to test the actual reading and writing 
 * of data to the file system.
 */
public class FileIntegrationTests extends PointWatcher {
	
	AccountDao adao = new AccountDaoFile();
	UserDao udao = new UserDaoFile();
	TransactionDao tdao = new TransactionDaoFile();
	Account testAct = new Account();
	User testUser = new User();
	
	@BeforeClass
	public static void setupFileLocations() {
		UserDaoFile.fileLocation = "target/integrationTests/users";
		AccountDaoFile.fileLocation = "target/integrationTests/accounts";
	}
	
	/*
	 * ACCOUNT INTEGRATION TESTS
	 */
	
	@Before
	public void createTestAccountAndUser() {
		testAct = new Account();
		testAct.setId(1);
		testAct.setOwnerId(1);
		testAct.setType(AccountType.CHECKING);
		testAct.setApproved(true);
		testAct.setBalance(14.32);
		adao.addAccount(testAct);
		testUser.setFirstName("TestFIRST");
		testUser.setLastName("TestLAST");
		testUser.setId(1);
		testUser.setPassword("hello_world");
		testUser.setUsername("testUser");
		testUser.setUserType(UserType.CUSTOMER);
		udao.addUser(testUser);
	}
	
	@After
	public void tearDown() throws IOException {
		Files.delete(Paths.get(AccountDaoFile.fileLocation));
	}
	
	@Test
	@Points(1)
	public void testAddAndGetAccount() {
		Account fromFile = adao.getAccount(1);
		assertEquals(testAct, fromFile);
	}
	
	@Test
	@Points(1)
	public void testGetAllAccounts() {
		Account secondAccount = new Account();
		secondAccount.setId(2);
		secondAccount.setOwnerId(1);
		secondAccount.setType(AccountType.SAVINGS);
		secondAccount.setApproved(false);
		secondAccount.setBalance(32.10);
		adao.addAccount(secondAccount);
		List<Account> all = adao.getAccounts();
		assertEquals(all.size(), 2);
	}
	
	@Test
	@Points(1)
	public void testUpdateAccount() {
		testAct.setApproved(false);
		testAct.setBalance(45.87);
		Account updated = adao.updateAccount(testAct);
		assertEquals(testAct, updated);
	}
	
	@Test
	@Points(1)
	public void testDeleteAccount() {
		boolean success = adao.removeAccount(testAct);
		if (success) {
			assertEquals(adao.getAccounts().size(), 0);
		} else {
			fail("Unable to delete account");
		}
	}
	
	@Test
	@Points(1)
	public void testGetAccountsByUser() {
		Account newAccount = new Account();
		newAccount.setId(1);
		newAccount.setOwnerId(1);
		newAccount.setType(AccountType.CHECKING);
		newAccount.setApproved(true);
		newAccount.setBalance(14.32);
		adao.addAccount(newAccount);
		Account secondAccount = new Account();
		secondAccount.setId(2);
		secondAccount.setOwnerId(2);
		secondAccount.setType(AccountType.SAVINGS);
		secondAccount.setApproved(false);
		secondAccount.setBalance(32.10);
		adao.addAccount(secondAccount);
		User u = new User();
		u.setId(2);
		// only secondAccount should be retrieved since it belongs to user 2
		List<Account> test = adao.getAccountsByUser(u);
		assertEquals(test.size(), 1);
		assertEquals(secondAccount, test.get(0));
	}
	
	/*
	 * USER INTEGRATION TESTS
	 */
	
	@Test
	@Points(1)
	public void testAddAndGetUser() {
		User actual = udao.getUser(testUser.getId());
		assertEquals(testUser, actual);
	}
	
	@Test
	@Points(1)
	public void testGetAllUsers() {
		User second = new User();
		second.setId(2);
		second.setUsername("test2");
		second.setPassword("someTestPassword");
		udao.addUser(second);
		List<User> allUsers = udao.getAllUsers();
		assertEquals(allUsers.size(), 2);
	}
	
	@Test
	@Points(1)
	public void testUpdateUser() {
		testUser.setFirstName("Charlie");
		udao.updateUser(testUser);
		assertEquals(udao.getUser(testUser.getId()).getFirstName(), "Charlie");
	}
	
	@Test
	@Points(1)
	public void testDeleteUser() {
		boolean success = udao.removeUser(testUser);
		if (success) {
			assertEquals(udao.getAllUsers().size(), 0);
		} else {
			fail("Unable to delete account");
		}
	}
	
	/*
	 * TRANSACTION INTEGRATION TESTS
	 */
	@Test
	@Points(1)
	public void getAllTransactions() {
		Transaction t = new Transaction();
		t.setSender(testAct);
		Account to = new Account();
		to.setId(3);
		to.setApproved(true);
		t.setRecipient(to);
		t.setAmount(5d);
		t.setTimestamp();
		t.setType(TransactionType.TRANSFER);
		testAct.setTransactions(Arrays.asList(t));
		adao.updateAccount(testAct);
		List<Transaction> list = tdao.getAllTransactions();
		assertEquals(list.size(), 0);
	}
}
