package com.revature;

public class ArrayDimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5]; // single dimensional array - 5 rows

		int b[][] = new int[2][2]; // two dimensional array - (2 rows & 2 columns)
		// multi-dimensional arrays are used in matrix manipulation

		b[0][0] = 5; // First row, first column
		b[0][1] = 7; // first row, second column
		b[1][0] = 3; // second row, first column
		b[1][1] = 4; // second row, second column
		// 5 7
		// 3 4

		int c[][] = { { 6, 8 }, { 9, 10 } };
		
		int d[][] = new int[2][2];
		
		//Array addition - matrics addition
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				d[i][j] = b[i][j]+c[i][j];
			}
		}
		
//		System.out.println(d);
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}

	}

}
