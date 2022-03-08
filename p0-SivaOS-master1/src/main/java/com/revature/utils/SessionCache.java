package com.revature.utils;

import java.util.Optional;

import com.revature.beans.User;

/**
 * Cache which stores the currently logged in User 
 */
public class SessionCache {
	
	private static Optional<User> loggedInUser;
	
	public static Optional<User> getCurrentUser() {
		return loggedInUser;
	}
	
	public static void setCurrentUser(User u) {
		loggedInUser = Optional.ofNullable(u);
	}

}
