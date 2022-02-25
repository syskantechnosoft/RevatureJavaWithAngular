package com.revature;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamReaderWriter {
	public static void main(String[] args) throws IOException {

		String message = "This will be converted to byte array then written to file";
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\revature\\buffered.txt"));
		byte[] data = message.getBytes();
		bos.write(data);
		System.out.println("Successfully written data to file");
		bos.close();

		// Read Operation
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\revature\\buffered.txt"));
		int value = 0;
		while ((value = bis.read()) != -1) {
			System.out.print((char) value);
		}
		bis.close();
	}
}
