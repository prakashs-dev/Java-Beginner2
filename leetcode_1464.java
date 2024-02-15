package com.leetCode;

import java.util.Arrays;

public class leetcode_1464 {
	public static void main(String[] args) {
		int nums[] = { 3, 7 };
		System.out.println(maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		Arrays.sort(nums);
		int i = nums.length - 1, j = nums.length - 2;
		int res = (nums[i] - 1) * (nums[j] - 1);
		return res;
	}
}
