package com.revature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationStarter {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\revature\\batch3\\serial.txt"));
		Employee emp = new Employee(100, "ABCD", "SI9878345");
		oos.writeObject(emp);
		System.out.println("Serialization is done successfully!!");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\revature\\batch3\\serial.txt"));
		Employee emp1 = (Employee) ois.readObject();
		System.out.println(emp1);
	}

}
