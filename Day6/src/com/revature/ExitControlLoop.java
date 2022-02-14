package com.revature;

public class ExitControlLoop {
	public static void main(String[] args) {
		int x=6;
		//exit control loop - one or more time
		do {
			System.out.println(x);
			x--;
		} while (x>5);
	}
}
