package com.revature.project0.dao;

import java.util.List;

import com.revature.project0.beans.User;

public interface UserDAO {

	public List<User> getUsers();

	public User getUser(int id);

	public User getUserByUsername(String username, String password);

	public void addUser(User user);

	public void updateUser(int id, User user);

	public void deleteUser(int id);

}
