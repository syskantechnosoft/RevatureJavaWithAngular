package com.revature.project.service;

import java.util.List;

import com.revature.project.bean.Users;
import com.revature.project.dao.UserDAO;

public class UserService {
	private UserDAO userDao;

	// Create of CRUD
	public void addUser(Users user) {
		userDao.addUser(user);
	}

	// Read of CRUD
	public List<Users> getAllUsers() {
		return userDao.getAllUsers();
	}

	// Read of CRUD
	public Users getUserById(int userid) {
		return userDao.getUserById(userid);
	}

	// Update of CRUD
	public void updateUser(Users user) {
		userDao.updateUser(user);
	}

	// Delete of CRUD
	public void deleteUser(int userid) {
		userDao.deleteUser(userid);
	}

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
}
