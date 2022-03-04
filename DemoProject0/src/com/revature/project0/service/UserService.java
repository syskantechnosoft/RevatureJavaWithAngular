package com.revature.project0.service;

import com.revature.project0.beans.User;

public interface UserService {

	public boolean login(String username, String password);

	public boolean register(User user);
	
	public boolean logout();

}
