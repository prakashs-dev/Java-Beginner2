package com.leetCode;

public class SlidingWindow239 {

	public static void main(String[] args) {
		int[] ar = { 2, 9, 31, -4, 21, 7 };
		int k = 3;
		System.out.println(maxSumSubArray(ar, k));
	}

	private static int maxSumSubArray(int[] ar, int k) {
		int wSum = 0;
		int mSum = Integer.MIN_VALUE;

		for (int i = 0; i < k; i++) {
			wSum += ar[i];
		}
		for (int i = k; i < ar.length; i++) {
			wSum = wSum - ar[i - k] + ar[i];
			mSum = Math.max(mSum, wSum);
		}
		return mSum;
	}
}
