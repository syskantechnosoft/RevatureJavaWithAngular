package com.revature.project0;

import java.util.Scanner;

import com.revature.project0.beans.User;
import com.revature.project0.service.AccountService;
import com.revature.project0.service.TransactionService;
import com.revature.project0.service.UserService;
import com.revature.project0.service.UserServiceImpl;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		String username = null;
		String password = null;
		String firstName = null;
		String lastName = null;

		UserService userService = new UserServiceImpl();
		AccountService accountService = null;
		TransactionService transactionService = null;

		Scanner input = new Scanner(System.in);
		while (choice <= 3) {
			System.out.println("\t\t\t\t Welcome to Revature Bank \t\t\t\t");
			System.out.println("\t\t 1. Login ");
			System.out.println("\t\t 2. Register ");
			System.out.println("\t\t 3. Exit ");
			System.out.print("Enter your choice [1-3]:");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				// userService = new UserServiceImpl();
				System.out.print("Enter username :");
				username = input.next();
				System.out.print("Enter Password :");
				password = input.next();
				if (userService.login(username, password))
					System.out.println("Login is Successful!!!");
				else {
					System.out.println("Error while Logging. Pls Check the username / password!!!");
				}
				break;
			case 2:
				System.out.print("Enter FirstName :");
				firstName = input.next();
				System.out.print("Enter LastName :");
				lastName = input.next();
				System.out.print("Enter username :");
				username = input.next();
				System.out.print("Enter Password :");
				password = input.next();

				User user = new User(firstName, lastName, username, password, "customer");
				if (userService.register(user)) {
					System.out.println("User Successfully Registered!!! Pls Login to Continue...");
				} else {
					System.out.println("Error while Registering!!!!");
				}
				break;
			case 3:
				System.out.println("Thanks for using Revature Bank!!! Have a nice Day!!");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a number between 1 and 3");
				break;
			}

		}

		input.close();
	}

}
