package com.revature;

public class BoxingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20; //primitive integer variable
		
		Integer intObj = new Integer(a); //manual boxing
		//creating a Integer object using wrapper class
		
		
		Integer intObj3 = a; // auto boxing 
		Integer intObj2 = new Integer("250"); 
		
		System.out.println(intObj); //auto unboxing - convert object representation to it's primitive value
		
		System.out.println(intObj.intValue());
		
		System.out.println(intObj2.intValue());
		
		String str = "2500";
		String str2 = "5000";
		
		System.out.println("str+str2 = "+str+str2);
		
		System.out.println("str+str2 = " + (Integer.parseInt(str) + Integer.parseInt(str2)));
		
	}

}
