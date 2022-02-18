package com.revature;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; // primitive int variable declaration & initialization
		int b = 0;
		try {
			System.out.println("a/b = " + (a / b));
			// this line will throw an exception
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
//			e.printStackTrace(); // Costlier operation - If it consumes more memory or cpu or time
		}

		System.out.println("Program Ends here");
		// Ctrl+F11 - To run the java code in Eclipse
	}

}
