package com.revature;

interface MyFunctionalInt {
	int doMath(int number);
}

public class Execute {
	public static void main(String[] args) {
		MyFunctionalInt doubleIt = n -> n * 2;
		MyFunctionalInt subtractIt = n -> n - 2;
		int result1 = doubleIt.doMath(2);
		int result2 = subtractIt.doMath(8);
		System.out.println(result1); // 4
		System.out.println(result2); // 6
	}
}
