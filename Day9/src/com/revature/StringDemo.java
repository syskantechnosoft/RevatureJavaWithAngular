package com.revature;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 100; //primitive integer variable
		String str = "Hello World"; //String literal
		
		String str2 = new String ("Welcome to JAVA");
		String str3 = "2500";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str2.indexOf("J"));
		System.out.println(str2.contains("JAVA"));
		System.out.println(str2.charAt(4));
		System.out.println(str2.substring(11,15));
		
		System.out.println(str3.toUpperCase());
		
		//String will be created in String constant pool. - 
		//This is separate memory area to handle Strings
		
		String str4 = "m"; //object
		
		char gender = 'f'; //primitive
	}

}
