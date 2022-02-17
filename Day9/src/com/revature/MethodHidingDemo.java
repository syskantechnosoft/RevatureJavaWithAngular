package com.revature;

public class MethodHidingDemo {

	private static String name;

	private static void display() {
		System.out.println("static parent method");
	}
	
	public static void main(String[] args) {
		MethodHidingDemo.display();
		Sub1.display();
		
	}

}

class Sub1 extends MethodHidingDemo {
	
	public static void display() {
		System.out.println("Static child method");
	}
}
