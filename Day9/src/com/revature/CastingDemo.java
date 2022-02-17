package com.revature;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isOpen = false;
		byte age = 25;
		short year = 2022;
		char gender = 'm';
		int id = 25000;
		float salary = 35000.00f;
		double interestRate = 0.456;
		long mobile = 9809789867L;
		String str = "Hello World";
		
//		age = isOpen; //incompatible types
		year = age; //implicit type casting - no addition keyword
		
		age = (byte) year; //explicit type casting - downcasting
		
		Object obj = str;
		
	}

}
