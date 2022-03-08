package com.revature.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Account;
import com.revature.beans.Account.AccountType;
import com.revature.beans.User;
import com.revature.beans.User.UserType;
import com.revature.dao.AccountDao;
import com.revature.dao.AccountDaoDB;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoDB;
import com.revature.dao.UserDaoFile;
import com.revature.services.AccountService;
import com.revature.services.UserService;
import com.revature.utils.SessionCache;

/**
 * This is the entry point to the application
 */
public class BankApplicationDriver {

	public static void printLine() {
		for (int i = 0; i < 80; i++) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		int id = 0;
		Scanner input = new Scanner(System.in);
		String fName = null;
		String lName = null;
		String username = null;
		String password = null;
		UserDao userDao = new UserDaoDB();
		AccountDao accountDao = new AccountDaoDB();
		UserService userService = new UserService(userDao, accountDao);
		AccountService accountService = new AccountService(accountDao);
		while (choice < 6) {
			BankApplicationDriver.printLine();
			System.out.println("***** \t\t\t\t\t\t\t\t\t\t *****");
			System.out.println("***** \t\t\t\t\t\t\t\t\t\t *****");
			System.out.println("***** \t\t\t\t Welcome to Revature Bank \t\t\t *****");
			System.out.println("***** \t\t\t\t\t\t\t\t\t\t *****");
			System.out.println("***** \t\t\t\t\t\t\t\t\t\t *****");
			BankApplicationDriver.printLine();
			System.out.println("\n\t\t\t 1. Register ");
			System.out.println("\t\t\t 2. Login ");
			System.out.println("\t\t\t 3. View Customers ");
			System.out.println("\t\t\t 4. Remove Customer ");
			System.out.println("\t\t\t 5. Update Customer ");
			System.out.println("\t\t\t 6. Exit");
			System.out.print("Enter your Choice [1-6] :");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				id = UserDaoFile.usersList.size();
				System.out.print("Enter First Name :");
				fName = input.next();
				System.out.print("Enter Last Name :");
				lName = input.next();
				System.out.print("Enter Userame :");
				username = input.next();
				System.out.print("Enter Password :");
				password = input.next();

				User user = new User(id++, username, password, fName, lName, UserType.CUSTOMER);
				userService.register(user);
				break;
			case 2:
				System.out.print("Enter Userame :");
				username = input.next();
				System.out.print("Enter Password :");
				password = input.next();
				User loggedUser = userService.login(username, password);
				System.out.println("logged user :" + loggedUser);
				if (loggedUser != null) {
					System.out.println("Logged in Successfully!!!");
					SessionCache.setCurrentUser(loggedUser);

					int option = 0;
					int accountType = 0;
					double startingBalance = 0;

					while (option <= 6) {
						System.out.println("\t\t\t 1.Apply Account ");
						System.out.println("\t\t\t 2.Deposit");
						System.out.println("\t\t\t 3.Withdraw ");
						System.out.println("\t\t\t 4.Fund Transfer ");
						System.out.println("\t\t\t 5.Approve/Reject Account ");
						System.out.println("\t\t\t 6.Logout ");
						System.out.print("Enter your option [1-6]:");
						option = input.nextInt();
						switch (option) {
						case 1:
							System.out.print("select the Account Type [1.Checking/2.Saving]: ");
							accountType = input.nextInt();
							System.out.print("Enter Starting balance:");
							startingBalance = input.nextDouble();
							Account account = new Account();
							account.setBalance(startingBalance);
							System.out.println("Logged user ID :" + SessionCache.getCurrentUser().get().getId());
							account.setOwnerId(loggedUser.getId());
							account.setType(accountType == 1 ? AccountType.CHECKING.toString()
									: AccountType.SAVINGS.toString());
							List<Account> accountList = new ArrayList<Account>();
							accountList.add(account);
							loggedUser.setAccounts(accountList);
							accountService.createNewAccount(loggedUser);
							break;
						case 2:
							System.out.println("Available Accounts for this user");
							accountService.getAccounts(loggedUser).forEach(System.out::println);
							System.out.print("Enter Account ID to Deposit :");
							int accountId = 0 ;
							accountId = input.nextInt();
							System.out.print("Enter the amount to deposit :");
							double amount = 0;
							amount = input.nextDouble();
							account = accountDao.getAccount(accountId);
							accountService.deposit(account, amount);
							break;
						case 3:

							break;
						case 4:

							break;
						case 5:
							break;
						case 6:
							System.out.print("Do you want to Logout? (1.Yes/2.No) :");
							int logout = 0;
							logout = input.nextInt();
							if (logout == 1) {
								SessionCache.setCurrentUser(null);
							}
							break;
						default:
							System.out.println("Enter a number between 1 to 6");
							break;
						}

					}
				}
				break;
			case 3:
				userDao.getAllUsers().forEach(System.out::println);
				break;
			case 4:
				System.out.print("Enter Id of the customer to remove: ");
				id = input.nextInt();
				User u = userDao.getUser(id);
				userDao.removeUser(u);
				break;
			case 5:
				System.out.print("Enter Id of the customer to Update: ");
				id = input.nextInt();
				System.out.print("Enter First Name to Update :");
				fName = input.next();
				System.out.print("Enter Last Name to Update:");
				lName = input.next();
				System.out.print("Enter Password to Update:");
				password = input.next();
				User updatedUser = new User();
				updatedUser.setId(id);
				updatedUser.setFirstName(fName);
				updatedUser.setLastName(lName);
				updatedUser.setPassword(password);
				userDao.updateUser(updatedUser);
				break;
			case 6:
				System.out.println("Thanks for using Revature Bank!!! Have a Nice Day!!!");
				System.exit(0);
				break;

			default:
				break;
			}

		}

		input.close();
	}

}
