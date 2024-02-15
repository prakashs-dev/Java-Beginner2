package com.leetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_349 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int nums2[] = { 2, 2 };
		int arr[] = intersection(nums1, nums2);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i : nums1) {
			set1.add(i);
		}
		for (int j : nums2) {
			if (set1.contains(j)) {
				set2.add(j);
			}
		}
		System.out.println(set2);
		int ans[] = new int[set2.size()];
		int index = 0;
		for (int k : set2) {
			ans[index++] = k;
		}
		return ans;
	}

}
