package com.abStract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Demo {
	public static void main(String[] args) {

	}
}

class Sample {
	public static void main(String args[]) {

		int[] nums = { 1, 0, 1, 1, 0, 1 };
//		System.out.println(findMaxConsecutiveOnes(nums));

		int[] arr = { 1, 1, 5 };
//		System.out.println(singleNonDuplicate(arr));

//		System.out.println(9%3);

//		int[] score = {10, 5, 20, 20, 4, 5, 2, 25, 1};
//		List<Integer> list = breakingRecords(score);
//		for (int i : list) {
//			System.out.print(i+" ");
//		}
		List<Integer> ar = Arrays.asList(1, 3, 2, 6, 1, 2);
		System.out.println(divisibleSumPairs(ar.size(), 3, ar));
	}

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		// Write your code here
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = ar.get(i) + ar.get(j);
//				System.out.println(sum);
				if (sum % k == 0) {
					count++;
				}
			}
		}
		return count;
	}

	private static List<Integer> breakingRecords(int[] score) {

		int min = score[0], max = score[0];
		int minCount = 0, maxCount = 0;
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
				maxCount++;
			} else if (score[i] < min) {
				min = score[i];
				minCount++;
			}
		}
		List<Integer> list = new ArrayList<>();
		list.add(maxCount);
		list.add(minCount);
		return list;
	}

	public static String caseConvert(String s) {
		return s.toLowerCase();
	}

	private static int singleNonDuplicate(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		for (int i = 0, j = 1; i < nums.length - 1; i++, j++) {
			if (nums[i] != nums[j]) {
				return nums[i];
			} else {
				i++;
				j++;
			}
		}
		return nums[nums.length - 1];
	}

	private static int findMaxConsecutiveOnes(int[] nums) {

		int $1s = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				++$1s;
			} else {
				list.add(0);
			}
		}

		return $1s;
	}
}
