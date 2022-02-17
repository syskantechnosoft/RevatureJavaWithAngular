package com.revature;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentObject = new Parent();
		Child child1 = new Child();
		
		parentObject.id = 100;
		parentObject.firstName = "Sachin";
		parentObject.lastName = "Tendulkar";
		
		child1.firstName = "AJITH";
		//fully qualified class name [class name along with it's package name]
		com.revature.pack1.Child child2 = new com.revature.pack1.Child();
//		child2.
	}

}
