package com.leetCode;

import java.util.Scanner;

public class Problem59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number : ");
		int n = sc.nextInt();
		int[][] spl = spiral(n);
		
		for (int i = 0; i < spl.length; i++) {
			for (int j = 0; j < spl[0].length; j++) {
				System.out.print(spl[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] spiral(int n) {

		int spiraly[][] = new int[n][n];
		int row = n;
		int col = n;
		int sr = 0; // start row
		int sc = 0; // start Column
		int num = 1;

		while (sr < row && sc < col) {
			for (int i = sc; i < col; i++) {
				spiraly[sr][i] = num;
				num++;
			}
			sr++;

			if (sr < row && sc < col) {
				for (int j = sr; j < row; j++) {
					spiraly[j][col - 1] = num;
					num++;
				}
				col--;
			}

			if (sr < row && sc < col) {
				for (int i = col - 1; i >= sc; i--) {
					spiraly[row - 1][i] = num;
					num++;
				}
				row--;
			}

			if (sr < row && sc < col) {
				for (int j = row - 1; j >= sr; j--) {
					spiraly[j][sc] = num;
					num++;
				}
				sc++;
			}
		}

		return spiraly;
	}
}
