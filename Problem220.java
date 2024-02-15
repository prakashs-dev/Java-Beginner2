package com.leetCode;

import java.util.HashMap;
import java.util.Map;

public class Problem220 {

	public static void main(String[] args) {

		int[] nums = { 1, 5, 9, 1, 5, 9 };
		int indexDiff = 2, valueDiff = 3;
		boolean result = containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff);
		System.out.println(result);

	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - map.get(nums[i])) <= indexDiff
					&& Math.abs(nums[i] - nums[i]) <= valueDiff) {
				return true;
			}
		}
		return false;
	}
}