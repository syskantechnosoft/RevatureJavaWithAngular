package com.revature;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extendable ref1 = new Extendable() {
			@Override
			public void extend() {
				System.out.println("Extend method anonymous implementation");
			}
		};

		ref1.extend();

		// lambda implementation
		Extendable ref2 = () -> {
			System.out.println("Lambda implementation of extend method");
		};
		// lambda with zero argument and no return
		Extendable ref3 = () -> System.out.println("Lambda one line implementation of extend method");

		ref2.extend();
		ref3.extend();

		Drawable ref4 = new Drawable() {

			@Override
			public void draw(int l, int b) {
				// TODO Auto-generated method stub
				System.out.println("Drawing a rectangle of length " + l + " and breadth " + b);
			}
		};

		ref4.draw(5, 3);
		// Lambda implementation
		Drawable circle = (c, r) -> System.out
				.println("drawing a circle from the center point " + c + " and with a radius " + r);

		circle.draw(10, 7);

		Drawable triangle = (b, h) -> System.out.println("Drawing a triangle with base " + b + " and height " + h);
		
		triangle.draw(25, 17);
	}

}
