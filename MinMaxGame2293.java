package com.leetCode;

public class MinMaxGame2293 {

	public static void main(String[] args) {
		int[] nums = {1,3,5,2,4,8,2,2};
		System.out.println(minMaxGame(nums));
	}

	private static int minMaxGame(int[] nums) {
		if(nums.length == 1) return nums[nums.length-1];
		int[] newNums = new int[nums.length/2];
		for (int i = 0; i < nums.length/2; i++) {
			if(i % 2 == 0) {
				newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
			}else {
				newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
			}
		}
		return minMaxGame(newNums);
	}
}
