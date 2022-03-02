package com.revature.driver;

import java.util.Scanner;

import com.revature.beans.User;
import com.revature.beans.User.UserType;
import com.revature.dao.AccountDao;
import com.revature.dao.AccountDaoFile;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoFile;
import com.revature.services.UserService;

/**
 * This is the entry point to the application
 */
public class BankApplicationDriver {

	public static void printLine() {
		for (int i = 0; i < 80; i++) {
			System.out.print("*");
		}
	}

	public static void register(User user) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		int id=0;
		Scanner input = new Scanner(System.in);
		String fName = null;
		String lName = null;
		String username = null;
		String password = null;
		UserDao userDao = new UserDaoFile();
		AccountDao accountDao = new AccountDaoFile();
		UserService userService = new UserService(userDao, accountDao);

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
				
				User user = new User(id++,username, password, fName, lName, UserType.CUSTOMER);
				userService.register(user);
				break;
			case 2:

				break;
			case 3:
				System.out.println(userDao.getAllUsers());
				break;
			case 4:

				break;
			case 5:

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
