package com.revature;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set mySet = new HashSet();
		
		mySet.add(34);
		mySet.add(21);
		mySet.add(53);
		mySet.add(78);
		mySet.add(11);
		mySet.add(26);
		mySet.add(53);
		mySet.add(34);
		
		System.out.println(mySet);
		
		//set will not allow duplicates
		//Set will not maintain insertion order
		
		mySet.forEach(System.out::println);
	}

}
