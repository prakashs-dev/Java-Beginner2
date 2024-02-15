package com.leetCode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {

		int nums1[] = { 1, 3 }, nums2[] = { 2 };
		int len = nums1.length + nums2.length;
		int arr[] = new int[len];
		System.arraycopy(nums1, 0, arr, 0, nums1.length);
		System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		int median = len / 2;
		System.out.println("median "+median);	

		if (arr.length % 2 == 0) {
			System.out.println((double) (arr[median - 1] + arr[median]) / 2);
		}else {
			System.out.println("else "+arr[median]);
		}
	}
}
