package com.revature;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List linkedList = new LinkedList();
		linkedList.add(25);
		linkedList.add(75);
		linkedList.add(65);
		linkedList.add(15);
		linkedList.add(85);
		linkedList.add(95);
		linkedList.add(5);
		
		System.out.println(linkedList);
		
		//easiest operation - adding or removing element from the beginning
		//costlier operation - adding or removing element at the end
	}

}
