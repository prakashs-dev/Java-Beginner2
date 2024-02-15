package com.leetCode;

import java.util.Arrays;

public class problem414 {

	public static void main(String[] args) {

		int nums[] = { 1,1,2 };
		System.out.println(third_Max(nums));
	}

	private static int third_Max(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		if (n < 3) {
			return nums[n - 1];
		} else {
			int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				if (nums[i] > first) {
					first = nums[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (nums[i] > second && nums[i] < first) {
					second = nums[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (nums[i] > third && nums[i] < second) {
					third = nums[i];
				}
			}
//			return third < 0 ? first : third;
			if (third < 0 || third > 0) {
				if (third == Integer.MIN_VALUE) {
					return third;
				} else {
					return third;
				}
			} else {
				return first;
			}
		}
	}
}
