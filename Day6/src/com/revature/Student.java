package com.revature;

public class Student {

	private int id;
	private String name;
	static String staticVariable = "This is a static variable";

	public Student() {
		super();
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public void display() {
		System.out.println("This is display method");
	}

	public static void staticMethod() {
//		staticVariable = "This is a static variable";
		System.out.println("This is a static method  " + staticVariable);
	}

}
