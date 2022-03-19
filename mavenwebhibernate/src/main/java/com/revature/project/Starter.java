package com.revature.project;

import com.revature.project.bean.Users;
import com.revature.project.dao.UserDAO;
import com.revature.project.service.UserService;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		UserDAO userDao = new UserDAO();
		userService.setUserDao(userDao);

		// Add new user - Create of CRUD
		Users user1 = new Users();
		user1.setUsername("John");
		user1.setPassword("JC");

		user1.setEmail("john@sample.com");
		Users user2 = new Users();
		user2.setUsername("Robin");
		user2.setPassword("RC");
//		try {
//			Date dob = new SimpleDateFormat("yyyy-MM-dd").parse("1975-01-01");
//			user2.setDob(dob);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		user2.setEmail("robin@sample.com");

		userService.addUser(user1);
		userService.addUser(user2);

		// Get all users - Read of CRUD
		for (Users retrivedUser : userService.getAllUsers()) {
			System.out.println(retrivedUser.getUsername());
			System.out.println(retrivedUser.getPassword());
			System.out.println(retrivedUser.getEmail());
//			System.out.println(retrivedUser.getDob());
		}

		// Get user by id - Read of CRUD
		Users retrivedUser = userService.getUserById(1);
		System.out.println(retrivedUser.getUsername());
		System.out.println(retrivedUser.getPassword());
		System.out.println(retrivedUser.getEmail());
//		System.out.println(retrivedUser.getDob());

		// Update user - Update of CRUD
		user1.setEmail("johnUpdated@sample.com");
		user1.setId(1);
		userService.updateUser(user1);

		// Delete user - Delete of CRUD
		userService.deleteUser(1);

	}

}
