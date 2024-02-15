package com.leetCode;

public class RotateImage_48{

	public static void main(String[] args) {
		
//		int matrix[][]= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row = matrix.length, col = matrix[0].length;
		int ridx = 0;
		for (int i = 0; i < col; i++) {
			int cidx = 0;
			for (int j = row-1; j >= 0; j--) {
				System.out.println(ridx+" "+cidx);
				matrix[ridx][cidx] = matrix[j][i];
				++cidx;
			}
			++ridx;
		}
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
