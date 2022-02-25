package com.revature;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.multi.MultiFileChooserUI;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myFile = new File("d:\\Revature\\sample.txt");
		System.out.println("Is File Present? : "+myFile.exists());
		System.out.println("Is it a Directory? :"+myFile.isDirectory());
		System.out.println("Is it a File? :"+myFile.isFile());
		
		System.out.println("Is File Created? :"+myFile.createNewFile());
		
		System.out.println("Is File Present? : "+myFile.exists());
		System.out.println("Is it a Directory? :"+myFile.isDirectory());
		System.out.println("Is it a File? :"+myFile.isFile());
		
	}

}
