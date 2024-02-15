package com.leetCode;

import java.util.Arrays;

class Full{

	public static int productItSelf(int[] nums, int n) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		return nums[nums.length - n];
	}
	
}


public class problem238 {

	public static void main(String[] args) {
		int []nums = {3,2,1,5,6,4}; int k = 2;
		int result = Full.productItSelf(nums,k);
		System.out.println("ans "+result);
		
	}
}
