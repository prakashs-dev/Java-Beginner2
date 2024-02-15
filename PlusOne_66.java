package com.leetCode;

class AdminUser {

	public static int[] plusOne(int[] digits) {
		StringBuffer sb = new StringBuffer();
		for (int i : digits) {
			sb.append(i);
		}
		int sum = Integer.parseInt(sb.toString()) + 1;
		int len = String.valueOf(sum).length();
		int arr[] = new int[len];
		while (sum != 0) {
			arr[len - 1] = sum % 10;
			len--;
			sum /= 10;
		}
		return arr;
	}
}

public class PlusOne_66 {

	public static void main(String[] args) {
		int[] digits = { 9, 9, 8 };
		int res[] = AdminUser.plusOne(digits);
		for (int i : res) {
			System.out.print(i+ " ");
		}
	}
}
