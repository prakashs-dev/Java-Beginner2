package com.leetCode;

import java.util.Scanner;

public class Problem231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ans = isPowerOfTwo(a);
		System.out.println(ans);
	}

	private static int isPowerOfTwo(int n) {
		
		int b = 1, p = 2;
		
		while (b != 0) {
			int res = (int)Math.pow(b, p);
		}
		return n;
	}
}
