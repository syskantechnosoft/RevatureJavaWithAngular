package com.revature.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.revature.beans.User;

/**
 * Implementation of UserDAO that reads and writes to a file
 */
public class UserDaoFile implements UserDao {

	public static String fileLocation = "src\\output\\users.txt";
	private static File userFile = new File(fileLocation);
	private static int id = 0;
	public static List<User> usersList = new ArrayList<User>();

	public User addUser(User user) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(userFile))) {
			oos.writeObject(user);
			System.out.println("User Successfully Registered!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user;
	}

	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		User requestedUser = null;
		for (User user : usersList) {
			if (user.getId() == userId)
				requestedUser = user;
		}
		return requestedUser;
	}

	public User getUser(String username, String pass) {
		// TODO Auto-generated method stub
		User requestedUser = null;
		for (User user : usersList) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(pass))
				requestedUser = user;
		}
		return requestedUser;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(userFile))) {
			do {
				usersList.add((User) ois.readObject());
			} while (ois.readObject() != null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return usersList;
	}

	public User updateUser(User u) {
		// TODO Auto-generated method stub

		return null;
	}

	public boolean removeUser(User u) {
		// TODO Auto-generated method stub
		boolean status = false;
		for (User user : usersList) {
			if (user.getId() == u.getId())
				status = usersList.remove(u);
		}
		return status;
	}

}
