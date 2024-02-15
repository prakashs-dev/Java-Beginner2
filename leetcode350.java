package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode350 {

	public static void main(String[] args) {
//		int[] nums1 = {1,2,2,1}, nums2 = {2,2};
//		int[] res = intersect(nums1,nums2);
//		for (int i : res) {
//			System.out.print(i+" ");
//		}

//		int[] nums = { 4, 2, 5, 7 };
//		int[] ar = sortArrayByParityII(nums);
//		for (int i : ar) {
//			System.out.print(i + " ");
//		}

//		List<String> words = Arrays.asList("one.two.three", "four.five", "six");
//		char separator = '.';
//		List<String> res = splitWordsBySeparator(words,separator);
//		for (String str : res) {
//			System.out.print(str+" ");
//		}

		List<Integer> arr = Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
		List<Integer> brr = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);
		List<Integer> res = missingNumbers(arr, brr);
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

	private static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		List<Integer> misNum = new ArrayList<>();
		for (int num : brr) {
			if (!arr.contains(num)) {
				misNum.add(num);
			}
		}
//		System.out.println("Missing Number "+misNum);
		return misNum;
	}

	private static List<String> splitWordsBySeparator(List<String> words, char separator) {

		List<String> outStr = new ArrayList<>();
		String ch2St = String.valueOf(separator);
		for (String str : words) {
			String[] sepWord = str.split("\\Q" + ch2St + "\\E");
			for (String splitWord : sepWord) {
				if (!splitWord.isEmpty()) {
					outStr.add(splitWord);
				}
			}
		}
		return outStr;
	}

	private static int[] sortArrayByParityII(int[] nums) {
		int evenIdx = 0, oddIdx = 1;
		int[] a = new int[nums.length];
		for (int i : nums) {
			if (i % 2 == 0) {
				a[evenIdx] = i;
				evenIdx += 2;
			} else {
				a[oddIdx] = i;
				oddIdx += 2;
			}
		}
		return a;
	}
}
