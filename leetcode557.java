package com.leetCode;

public class leetcode557 {

	public static void main(String[] args) {

		int n = 13;
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum += sum * (n - i);
		}
		System.out.println(sum);
		int zeroCount = 0;
		while (sum != 0) {
			if (sum % 10 == 0) {
				zeroCount++;
			}
			if (sum % 10 != 0) {
				zeroCount++;
			}
			sum = sum / 10;
		}

		System.out.println(zeroCount);

	}
}
