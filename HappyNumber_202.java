package com.leetCode;

class user {
	public static boolean isHappy(int n) {

		if (n == 1)
			return true;
		if (n >= 2 && n <= 9)
			return false;

		int out = 0;
		while (n != 0 || out > 9) {
			if (n == 0) {
				n = out;
				out = 0;
			}
			int last = n % 10;
			out += Math.pow(last, 2);
			n = n / 10;
		}
		System.out.println(out);
		if (out == 1) {
			return true;
		} else {
			return false;
		}
	}
}

public class HappyNumber_202 {

	public static void main(String[] args) {
		int n = 19;
		System.out.println(user.isHappy(1111111));
	}
}
