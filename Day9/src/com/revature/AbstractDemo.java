package com.revature;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//indirect way of creating object of abstract class
		//Abstract class/ interface objects can be created using annonymous inner class
		MyAbstract 	obj = new MyAbstract() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Display method!!!");
			}
		};
}

}

abstract class MyAbstract {

	public abstract void display();
}
