package com.revature;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List numberList = new ArrayList();
		
		// Arrays won't work with primitive values
		int a = 25;
		int b = 75;
		
		//Auto Boxing happens here
		numberList.add(a); 
		numberList.add(b);
		numberList.add(25);
		numberList.add(70);
		System.out.println(numberList);
		numberList.add(2, 50);
		
		System.out.println(numberList);
		
		//Easiest operation - adding / removing element at the end
		//Arraylist is dynamically growing array
		//adding or removing operation will not involve with any shift left or shift right operation
		
		//Arraylist is not suitable for inserting / removing at the beginning or in the middle
	}

}
