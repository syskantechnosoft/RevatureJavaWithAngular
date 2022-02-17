package com.revature;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9; //4 bytes
		//type casting - converting one primitive data type to another primitive type
		short y=25; //2 bytes 
		//short is smaller than int
		x = y; //assigning smaller value to bigger value - implicit type casting
		//widening
		
		y=(short) x;//assigning bigger value to smaller value - explicit type casting
		//shortening 
		
		//type casting - primitive to primitive conversion
	}

}
