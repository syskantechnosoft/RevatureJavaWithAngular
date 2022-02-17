package com.revature;

public class AbstractionDemo {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		
		Child c1 = new Child();
		
		Parent p2 =  new Child(); //implicit type casting is happening
		
		Child c2 = (Child) new Parent(); //explicit type casting is needed
		
	}
}
