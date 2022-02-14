package com.revature;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Annonymous inner class
		MyAbstract obj1 = new MyAbstract() {
			
			//This is empty method
			@Override
			public void display1() {
				// TODO Auto-generated method stub
				
			}
		};
		MyAbstractImpl obj2 = new MyAbstractImpl();
		
		AbstractClass1 obj3 = new AbstractClass1() {
		};
	}

}
