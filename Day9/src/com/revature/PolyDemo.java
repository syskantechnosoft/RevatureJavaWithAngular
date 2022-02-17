package com.revature;

public class PolyDemo {

	public void add(int num1, int num2) {
		System.out.println("Addition result ints add:" + (num1 + num2));
	}

	public void add(int num1, float num2) // signature line of method - access modifier return type name of the method
	{
		System.out.println("Addition result int float add:" + (num1 + num2));
	}

	public void add(float num1, float num2) // signature line of method - access modifier return type name of the method
	{
		System.out.println("Addition result floats add:" + (num1 + num2));
	}

	public void add(float num1, int num2) // signature line of method - access modifier return type name of the method
	{
		System.out.println("Addition result float + int add:" + (num1 + num2));
	}

	public void add(float num1, float num2, float num3) // signature line of method - access modifier return type name
														// of the method
	{
		System.out.println("Addition result (float + float +float add):" + (num1 + num2 + num3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyDemo obj = new PolyDemo();
		obj.add(4.56f, 7.32f);
		obj.add(200, 700);
		obj.add(5.9875f, 78);
		obj.add(250, 73.98456f);
		obj.add(4.764f, 1.9845f,98.234f);
	}

}
