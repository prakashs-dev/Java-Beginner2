package com.leetCode;

public class Problem34 {
	
	public static void main(String[] args) {
		
		int nums[] = {5,8,7,8,8,10};
		int tar = 8;
		int a[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == tar) {
				a[0] = i;
				continue;
			}
			if(nums[i] == tar) {
				a[1] = i;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}
