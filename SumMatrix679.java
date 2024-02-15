package com.leetCode;

import java.util.Arrays;

public class SumMatrix679 {

	public static void main(String[] prakash) {
//		int[][] nums = { { 7, 2, 1 }, { 6, 4, 2 }, { 6, 5, 3 }, { 3, 2, 1 } };
		int[][] nums = { { 1 } };
		System.out.println(matrixSum(nums));
	}

	public static int matrixSum(int[][] nums) {
		int sum = 0;
//		for (int[] i : nums) {
//			Arrays.sort(i);
//		}
		for (int i = 0; i < nums[0].length; i++) {
			int max = 0;
			for (int j = 0; j < nums.length; j++) {
				max = Math.max(max, nums[j][i]);
			}
			System.out.println("max " + max);
			sum += max;
		}

		return sum;
	}
}
