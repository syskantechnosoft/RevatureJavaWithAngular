package com.revature;

public class InvalidAgeException extends RuntimeException {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Age is Invalid";
	}
}
