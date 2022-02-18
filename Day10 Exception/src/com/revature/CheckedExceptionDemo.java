package com.revature;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File f = new File("D:\\Revature\\Batch3\\myfile.txt");
		f.createNewFile(); //IO Exception is a checked/compile time exception 
		
		System.out.println("done");
		
		System.out.println("tab key \n - (horizantal space) ");
	}

}
