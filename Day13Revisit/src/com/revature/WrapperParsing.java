package com.revature;

public class WrapperParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "250";
		String str2 = "450";
		
		System.out.println(str+str2); //output is 250450 not 700
		
		System.out.println(Integer.parseInt(str) + Integer.parseInt(str2)); //output is 700
		
	}

}
