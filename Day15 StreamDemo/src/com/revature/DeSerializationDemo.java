package com.revature;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\revature\\serialised.txt"));

		BankAccount accountObject = null;

		accountObject = (BankAccount) ois.readObject();

		System.out.println(accountObject);
		ois.close();
	}

}
