package com.revature.mavendemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder strBuilder = new StringBuilder("Hello");
		System.out.println(strBuilder.append(" World!!!!"));
		System.out.println(strBuilder);
		
		//StringBuilder & StringBuffer -- mutable string objects
		//StringBuffer - Thread safe / can work when multiple threads also running
		//StringBuilder - faster - Non Thread-safe
	}

}
