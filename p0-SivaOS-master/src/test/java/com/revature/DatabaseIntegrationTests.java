package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.revature.beans.Account;
import com.revature.beans.Account.AccountType;
import com.revature.beans.Transaction;
import com.revature.beans.Transaction.TransactionType;
import com.revature.beans.User.UserType;
import com.revature.beans.User;
import com.revature.dao.AccountDao;
import com.revature.dao.AccountDaoDB;
import com.revature.dao.TransactionDao;
import com.revature.dao.TransactionDaoDB;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoDB;

/**
 * These tests use the database DAO implementation to read/write to a database. This will help you test
 * the integration of your JDBC code and the database.
 * 
 * If you are using a local database these tests will fail when run on a remote server (i.e. on Github Actions),
 * so they are ignored for scoring purposes. But, you can remove the @Ignore annotation while
 * you run these tests on your machine. Don't forget to put it back again before you
 * push your code though.
 */
@Ignore
public class DatabaseIntegrationTests extends PointWatcher {
	
	AccountDao adao = new AccountDaoDB();
	Account toTest = new Account();
	UserDao udao = new UserDaoDB();
	User testUser = new User();
	TransactionDao tdao = new TransactionDaoDB();
	
	@Before
	public void setupAccountAndUser() {
		toTest = new Account();
		toTest.setId(1);
		toTest.setOwnerId(1);
		toTest.setType(AccountType.CHECKING);
		toTest.setApproved(true);
		toTest.setBalance(14.32);
		adao.addAccount(toTest);
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
		adao.removeAccount(toTest);
	}
	
	@Test
	public void testAddAccount() {
		Account fromDB = adao.getAccount(toTest.getId());
		assertEquals(toTest, fromDB);
	}
	
	@Test
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
	public void testUpdateAccount() {
		toTest.setApproved(false);
		toTest.setBalance(45.87);
		Account updated = adao.updateAccount(toTest);
		assertEquals(toTest, updated);
	}
	
	@Test
	public void testDeleteAccount() {
		boolean success = adao.removeAccount(toTest);
		if (success) {
			assertEquals(adao.getAccounts().size(), 0);
		} else {
			fail("Unable to delete account");
		}
	}
	
	@Test
	public void testGetAccountsByUser() {
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
	public void testAddAndGetUser() {
		User actual = udao.getUser(testUser.getId());
		assertEquals(testUser, actual);
	}
	
	@Test
	public void testGetAllUsers() {
		User second = new User();
		second.setId(2);
		second.setUsername("test2");
		second.setPassword("someTestPassword");
		List<User> allUsers = udao.getAllUsers();
		assertEquals(allUsers.size(), 2);
	}
	
	@Test
	public void testUpdateUser() {
		testUser.setFirstName("Charlie");
		udao.updateUser(testUser);
		assertEquals(udao.getUser(testUser.getId()).getFirstName(), "Charlie");
	}
	
	@Test
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
	public void getAllTransactions() {
		Transaction t = new Transaction();
		t.setSender(toTest);
		Account to = new Account();
		to.setId(3);
		to.setApproved(true);
		t.setRecipient(to);
		t.setAmount(5d);
		t.setTimestamp();
		t.setType(TransactionType.TRANSFER);
		toTest.setTransactions(Arrays.asList(t));
		adao.updateAccount(toTest);
		List<Transaction> list = tdao.getAllTransactions();
		assertEquals(list.size(), 0);
	}
}
