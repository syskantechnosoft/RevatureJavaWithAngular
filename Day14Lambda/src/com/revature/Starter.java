package com.revature;

public class Starter {

	public static void main(String[] args) {
		// providing implementation to the say method using lambda
		Sayable ref1 = () -> System.out.println("say something!!!");

		// ref1.say();

		Sayable ref2 = () -> {
			System.out.println(" say something!!!");
			System.out.println(" Say something more!!!!");
			System.out.println(" say it loudly!!!");
		};

		ref2.say();

		Eatable squareIt = (f) -> f * f;
		Eatable cubeIt = (f) -> f * f * f;
		System.out.println("Square Value ="+squareIt.calculate(5));
		System.out.println("Cube Value ="+cubeIt.calculate(10));
	}

}
