package com.revature;

public interface MyInterface {
	//all the members of interface are public
	
	void show(); //all the methods are abstract by default. 
	//abstract keyword is not necessary in interface
	
	static void display() {
		System.out.println("This is a static method");
	}
	
	default void print() {
		System.out.println("This is a default method");
	}
	
//	public void printIt () {
//		System.out.println("This is normal method");
//	}

}
