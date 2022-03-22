package com.revature.p1.myp1.service;

import java.util.List;

import com.revature.p1.myp1.model.User;

public interface UserService {

	public List<User> findAll();

	public User findById(int id);

	public void addUser(User user);

	public void updateUser(int id, User user);

	public void removeUser(int id);

}
