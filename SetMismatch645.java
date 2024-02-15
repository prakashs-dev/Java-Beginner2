package com.leetCode;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch645 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
		int[] ans = findErrorNums(nums);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

	private static int[] findErrorNums(int[] nums) {

		int sum = nums.length * (nums.length + 1) / 2;
		int total_num = 0;
		int arr_sum = 0;
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
		}
		for (int i : set) {
			total_num += i;
		}
		for (int i : nums) {
			arr_sum += i;
		}
		int miss_num = sum - total_num;
		int duplicate = arr_sum - total_num;

		return new int[] {duplicate, miss_num};
	}
}
