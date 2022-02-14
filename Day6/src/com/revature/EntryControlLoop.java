package com.revature;

public class EntryControlLoop {

	public static void main(String[] args) {
		int i=10;
		//entry Control loop - zero or more time execution
		for (; i < 0; i++) {
			System.out.println("Hello World " + i);
		}

		while (i<10) {
			System.out.println(i);
			i++;
		}
		
		
	}

}
