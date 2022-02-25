package com.revature.mybank;

import java.util.Scanner;

import com.revature.mybank.beans.User;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String username = null;
		String password = null;
		String email = null;
		String mobile = null;
		String firstName = null;
		String lastName = null;
		int id = 0;
		System.out.print("Enter First Name : ");
		firstName = input.next();
		System.out.print("Enter last Name : ");
		lastName = input.next();
		System.out.print("Enter email : ");
		email = input.next();
		System.out.print("Enter mobile : ");
		mobile = input.next();
		System.out.print("Enter username : ");
		username = input.next();
		System.out.print("Enter password : ");
		password = input.next();
		System.out.println("Enter ID:");
		id = input.nextInt();
		User user = new User(id, firstName, lastName, email, mobile, username, password);

		System.out.println(user);
		input.close();
	}

}
