package com.revature;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stuObject = new Student();
		stuObject.display();
		stuObject.staticMethod(); //Accessing the static method in non-static way
		Student.staticMethod();// Accessing the static member
		//Static members can be accessed using the class name not using instance name
		//No need to create object to access the static members
		//static members are common to all the objects.
		//Static keyword can be used in variables & methods
		Student.staticVariable = "This is new value";
		Student newObject = new Student();
		newObject.staticMethod();
		Student obj1 = new Student();
		stuObject.staticMethod();
	}

}
