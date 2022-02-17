package com.revature.pack2;

public  class Car {

	private static String name; // Static member
	private int yearOfManufacture; // non-Static member
	private final float PRICE =50000.00f;
	private int fuelCapacity;

	@Override
	public String toString() {
		return "Car [yearOfManufacture=" + yearOfManufacture + " name =" + name + "]";
	}
	
	//public abstract void abstractMethod () ;

	public static void display() {
		System.out.println("This is a static method");
	}

	public void show() {
		System.out.println("This is a non-static method");
	}

	public static void main(String[] args) {
		Car obj1 = new Car();
		obj1.yearOfManufacture = 2020;
//		obj1.price = 45000.00f;
//		obj1.name = "Audi"; 
		Car.name = "Audi"; // Static members are called class members (Only one copy for all objects)
		// non-static members are called instance members (Once per object - different
		// copy for each objects)
		System.out.println(obj1);
		Car.display();
		obj1.show();

		Car obj2 = new Car();
		obj2.yearOfManufacture = 2021;
		Car.name = "Ford";
		System.out.println(obj2);
		System.out.println(obj1);
		obj2.show();
	
	}

}
