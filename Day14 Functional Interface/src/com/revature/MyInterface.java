package com.revature;

public interface MyInterface {
	
	//default method defined in interface
	default void show() {
		System.out.println("This is show method!!!");
	}
}
