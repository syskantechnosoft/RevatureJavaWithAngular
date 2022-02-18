package com.revature;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List nameList = new ArrayList();
		nameList.add("Sundar");
		nameList.add("James");
		nameList.add("Jhon");
		nameList.add("ABC");
		nameList.add("xyz");

		System.out.println(nameList);

		System.out.println(nameList.size());

		// using normal/simple for loop
		System.out.println("Using normal for loop");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}

		System.out.println(" Enhanced for loop");
		// enhanced for loop
		for (Object obj : nameList) {
			System.out.println(obj);
		}

		System.out.println("Using for each loop");
		// using for each
		nameList.forEach(System.out::println);
		
		
		System.out.println("At index 3 = "+nameList.get(3));
	}

}
