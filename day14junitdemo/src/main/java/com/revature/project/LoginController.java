package com.revature.project;

import java.util.Scanner;

import com.revature.project.entity.User;

public class LoginController {

	public boolean login(User user) {
		boolean loginStatus = false;
		if (user.getUsername().equalsIgnoreCase("admin") && user.getPassword().equals("admin123")) {
			System.out.println("inside if condition!!!");
			loginStatus = true;
		}
		return loginStatus;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********Welcome to Revature Bank ************");
		System.out.println("=============Please Login to Continue ============ ");
		Scanner input = new Scanner(System.in);
		System.out.print("\t\t\t Enter Your username here:");
		String username = null;
		String password = null;
		username = input.next();
		System.out.print("\n\t\t\t Enter Your Password here:");
		password = input.next();

		LoginController obj1 = new LoginController();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		System.out.println(user);
		boolean loginStatus = false;
		loginStatus = obj1.login(user);
		if (loginStatus)
			System.out.println("Login Successful!!!!");
		else
			System.out.println("Login Failed!!!! Please check your credentials");
		input.close();
	}

}
