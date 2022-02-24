package com.revature;

public class GarbageCollectionDemo {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		GarbageCollectionDemo s1 = new GarbageCollectionDemo();
		GarbageCollectionDemo s2 = new GarbageCollectionDemo();
		//s1 & s2 are reference variables. Reference variables are not objects.
		//Reference variables just holds address of the objects
		System.out.println(s1);
		//while printing an object reference, it will print the fully qualified name of the class
		//along with the memory address of object in hexa decimal form
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		//hashcode is the value of memory address in integer form
		System.out.println(s2.hashCode());
		
		s1 = null;
		s2 = null;
		System.gc(); // making a call to garbage collector (forcing garbage collector)
		//We are requesting JVM to reclaim the memory of un-used objects
	}
}
