package com.revature;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// try block with catch block
		try {
			System.out.println("Inside first try block");
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		// try block with finally block
		try {
			System.out.println("Inside second try block");
		} finally {
			System.out.println("Inside finally block");
			// resource clean-up code will be added
		}

		// try block with multiple catch block
		try {
			int a = 5;
			int b[] = new int[5];
			b[0] = 0;
//			System.out.println(a / b[0]);
//			System.out.println(b[5]);
			File f = new File("");
			f.createNewFile();

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException caught");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught ArrayIndexOutOfBoundsException");
		} catch (RuntimeException e) {
			System.out.println("caught RuntimeException");
		} catch (IOException e) {
			System.out.println("IO Exception Caught " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}

		// try with single catch block handling multiple exceptions
		try {
			int a = 5;
			int b[] = new int[5];
			b[0] = 0;
//			System.out.println(a / b[0]);
//			System.out.println(b[5]);
			File f = new File("");
			f.createNewFile();

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | IOException e) {
			System.out.println("Exception caught " + e.getMessage());
		}
		
		//try with resource 
		Scanner scan = new Scanner(System.in);
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Inside try with resource block");
		}catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("This is try with resource example. the Resource will be closed automatcally upon exit");
		}
		scan.close();
	}

}
