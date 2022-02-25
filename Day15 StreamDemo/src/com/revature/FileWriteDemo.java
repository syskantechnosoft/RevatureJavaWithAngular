package com.revature;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String message = "This is a new content this time.";
		//file Write or append operation
		FileWriter writer = new FileWriter("d:\\revature\\output.doc", false);
		writer.write(message);
		System.out.println("Data is written to file successfully!!!");
		writer.close();
		
		//file read operation
		FileReader reader = new FileReader("d:\\revature\\output.doc");
		int data = 0;
		
		while((data =reader.read())!=-1) {
			System.out.print((char)data);
		}
		reader.close();
	}

}
