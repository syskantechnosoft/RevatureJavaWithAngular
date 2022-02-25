package com.revature;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		BankAccount account = new BankAccount(100, "SAV1001202876", "savings", 450.76, 1000,"SSN1009878563");
		System.out.println(account);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\revature\\serialised.txt"));
		oos.writeObject(account);
		System.out.println("Serialization is done!!!");
		oos.close();
	}

}
