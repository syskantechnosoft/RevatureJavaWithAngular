package com.revature;

public class Starter {

	public static void main(String[] args) throws MyFirstException {
		// TODO Auto-generated method stub
		int a = 25;

		if (a > 25) {
			throw new MyFirstException();
		} else {
			System.out.println(" a is less than or equal to 25");
		}

		int age = 15;

		if (age < 18) {
			throw new InvalidAgeException();
		} else {
			System.out.println("Valid Age");
		}
	}

}
