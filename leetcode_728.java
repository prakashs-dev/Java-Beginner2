package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;

public class leetcode_728 {

	public static void main(String[] args) {
		int left = 1, right = 22;
//		List<Integer> list = selfDividingNumbers(left, right);
//		for (int li : list) {
//			System.out.print(li+" ");
//		}
		int n = 11;
//		System.out.println(findNthDigit(n));

		String s = "abcd", t = "abcde";
//		System.out.println(findTheDifference(s, t));
		
//		1446. Consecutive Characters
		String s1 = "abbcccddddeeeeedcba";
//		System.out.println(maxPower(s1));
		
//		1929. Concatenation of Array
		
		int []nums = {1,2,1};
//		int ans[] = getConcatenation(nums);
//		for (int i : ans) {
//			System.out.print(i+" ");
//		}
		
//		633. Sum of Square Numbers	
		int c = 5;
		System.out.println(judgeSquareSum(c));
		
	}

	private static boolean judgeSquareSum(int c) {
		
		int a = 0, b = 0, k = 0;
		for (int i = 1; i <= c; i++) {
			a = (int) Math.pow(i, 2);
			b = (int) Math.pow(i, 2);
			k = a + b;
			if(a+b == c) {
				return true;
			}else if(a+b > c) {
				return false;
			}
		}
		return false;
	}

	private static int[] getConcatenation(int[] nums) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		int arr[] = new int[nums.length+nums.length];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;
	}

	private static int maxPower(String s1) {
		int consecutive_char = 0, k = 0;
		for (int i = 0; i < s1.length()-1; i++) {
			if(s1.charAt(i) == s1.charAt(i+1)) {
				k++;
			}else {
				k = 0;
			}
			consecutive_char = Math.max(consecutive_char, k);
		}
		return Math.max(consecutive_char, k)+1;
	}

	private static char findTheDifference(String s, String t) {
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < t.length(); i++) {
			list.add(t.charAt(i));
		}
		for (int j = 0; j < s.length(); j++) {
			list.remove(list.indexOf(s.charAt(j)));
		}
		return list.get(0);
	}

	private static int findNthDigit(int n) {
		if (n <= 9) {
			return n;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i <= 9) {
				list.add(i);
			} else {
				String num = Integer.toString(i);
				int k = 0;
				while (num.length() > k) {
					char fistToLast = num.charAt(k);
					list.add(Character.getNumericValue(fistToLast));

				}
//		        for(int j = 0; j < num.length(); j++){
//		        }
			}
		}
		System.out.println(list);
		return list.get(n - 1);
	}

	private static List<Integer> selfDividingNumbers(int left, int right) {

		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (i <= 9) {
				list.add(i);
			} else {

			}
		}
		return null;
	}
}
