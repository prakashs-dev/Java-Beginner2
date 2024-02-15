package com.leetCode;

public class RotateArray_189 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums, k);
//		5,6,7 || 1,2,3,4
	}

	private static void rotate(int[] nums, int k) {
		if(k > nums.length){
			k = k % nums.length;
		}
		int[] arr = new int[nums.length];
		for (int i = 0; i < k; i++) {
			arr[i] = nums[nums.length-k+i];
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			arr[i] = nums[j++];
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
