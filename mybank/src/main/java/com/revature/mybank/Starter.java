package com.revature.mybank;

import java.util.Scanner;

import com.revature.mybank.beans.User;

public class Starter {

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
		Scanner input = new Scanner(System.in);

		while (choice < 5) {
			Starter.printLine();
			System.out.println("***** \t\t\t\t\t\t\t\t\t\t *****");
			System.out.println("***** \t\t\t\t\t\t\t\t\t\t *****");
			System.out.println("***** \t\t\t\t Welcome to Revature Bank \t\t\t *****");
			System.out.println("***** \t\t\t\t\t\t\t\t\t\t *****");
			System.out.println("***** \t\t\t\t\t\t\t\t\t\t *****");
			Starter.printLine();
			System.out.println("\n\t\t\t 1. Register ");
			System.out.println("\t\t\t 2. Login ");
			System.out.println("\t\t\t 3. Apply for Loan ");
			System.out.println("\t\t\t 4. Check Eligibility for Loan ");
			System.out.println("\t\t\t 5. Exit");
			System.out.print("Enter your Choice [1-5] :");
			choice = input.nextInt();

			switch (choice) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
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
