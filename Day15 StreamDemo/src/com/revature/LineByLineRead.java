package com.revature;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LineByLineRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String message = "This will be converted to byte array then written to file";

		
		BufferedWriter buff = new BufferedWriter(new FileWriter("d:\\revature\\bufferedfile.txt"));
		buff.write(message);
		System.out.println("completed Buffered writing ");
		buff.close();
		
		BufferedReader buffRead = new BufferedReader(new FileReader("d:\\revature\\bufferedfile.txt"));
		String line = null;
		while((line=buffRead.readLine())!= null) {
			System.out.println(line);
		}
		buffRead.close();
	}

}
