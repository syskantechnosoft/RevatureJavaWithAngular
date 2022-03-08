package com.revature.exceptions;

/**
 * Should be thrown when a user attempts to withdraw more money
 * than exists in their account
 */
public class OverdraftException extends RuntimeException {

	private static final long serialVersionUID = -7168679456912742268L;

}
