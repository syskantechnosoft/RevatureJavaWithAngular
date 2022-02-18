package com.revature;

//User-defined exception or custom exception
public class MyFirstException extends Exception {

	// ctrl+Space or cmd+space
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "MyFirstException Object is thrown";
	}
}
