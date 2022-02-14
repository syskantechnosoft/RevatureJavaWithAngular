package com.revature;

import java.util.Date;

public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date(122, 1, 14);
		
		System.out.println(today);
		
		java.sql.Date current = new java.sql.Date(122, 1,14);
		System.out.println(current);
	}

}
