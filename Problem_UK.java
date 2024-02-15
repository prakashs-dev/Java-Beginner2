package com.leetCode;

class Solution {
	public static int strStr(String haystack, String needle) {

		int len = needle.length();
		for (int i = 0; i < haystack.length(); i++) {
			if(len > haystack.length()) return -1;
			String word = haystack.substring(i, len);
			len++;
			if(needle.equals(word)) {
				return i;
			}
		}
		return -1;
	}
}

public class Problem_UK {

	public static void main(String[] args) {

		String haystack = "Prakash", needle = "ash";
		System.out.println(Solution.strStr(haystack,needle));
		
		String str ="hello";
		
		
	}
}
