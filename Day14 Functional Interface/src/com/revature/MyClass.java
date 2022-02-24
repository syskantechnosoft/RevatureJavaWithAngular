package com.revature;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.forEach(str -> System.out.println(str));
	}

}
