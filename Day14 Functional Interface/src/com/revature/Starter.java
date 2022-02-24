package com.revature;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating interface reference using anonymous inner class
		Writable ref1 = new Writable() {

			@Override
			public void write() {
				// TODO Auto-generated method stub
				System.out.println("Inside write method!!!");
			}
		};

		ref1.write();

		// Creating interface reference using Lambda

		Writable ref2 = () -> System.out.println("Inside Lambda write method!!!");

		ref2.write();

		Writable ref3 = () -> System.out.println("Inside Lambda write method - for Ref3!!!");

		ref3.write();
	}

}
