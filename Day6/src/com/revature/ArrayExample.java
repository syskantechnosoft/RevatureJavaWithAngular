package com.revature;

public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];// integar array which can store 5 elements
		int[] b = { 5, 6, 3, 2, 7 }; // integer array with initial element values
		// We can't create an array without specifying the size or assigning tha value
		// valu directly
		// int []c = new int[]; //error line -- array size is not specified

//		System.out.println(a[5]); // Arrays are fixed in size

		a = new int[10];// manually changing the size of an array

		
		  // homogeneous array - this can hold same data 
		float[] f = new float[5];
		f[0] = 5.675f;
		f[1] = 7.98f;
		f[4] = 5.34f;
		f[2] = 7.89f;
		f[3] = 3.45f;
		f[5] = 6.78f; //Index Out of Bound  - Index check wil happen in run-time
		  //trying to access invalid array index
//		  int float char
		
		//Heterogenous arrays
		Object objArray[] = new Object[10];
		Object obj2[] = {4.5f,3, 'c',78.9867,"Hello", true,0x345EF, new Student(),9878985478l};
		 
	}

}
