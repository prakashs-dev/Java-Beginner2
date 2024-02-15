package com.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReversePrefixWord2000 {

	public static void main(String[] args) {
		String word = "abcdefd";
		char ch = 'd';
//		System.out.println(reversePrefix(word,ch));

		String s = "book";
//		System.out.println(halvesAreAlike(s));
		
//		350. Intersection of Two Arrays II
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] arr = intersect(nums1, nums2);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		Set<Integer> list = new HashSet<>();
		Set<Integer> al = new HashSet<>();
		for (int i : nums1) {
			list.add(i);
		}
		for (int j : nums2) {
			if(list.contains(j)) {
				al.add(j);
			}
		}
		int[] res = new int[al.size()];
		int k = 0;
		for (int i : al) {
			res[k++] = i;
		}
		return res;
	}

	private static boolean halvesAreAlike(String s) {
		Set<Character> alphaChar = new HashSet<>() ;
		alphaChar.add('a'); alphaChar.add('e');alphaChar.add('i'); alphaChar.add('o'); alphaChar.add('u');
		alphaChar.add('A'); alphaChar.add('E');alphaChar.add('I'); alphaChar.add('O'); alphaChar.add('U');
		int mid = s.length() / 2;
		int firstCount = 0, secCount = 0;
		for (int i = 0; i < mid; i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(mid+i);
			if(alphaChar.contains(c1))firstCount++;
			if(alphaChar.contains(c2))secCount++;
		}
		return firstCount == secCount ? true : false;
	}

	private static String reversePrefix(String word, char ch) {

		int idx = word.indexOf(ch);
		String s = word.substring(0, idx + 1);
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString() + word.substring(idx + 1, word.length());
		return s;
	}
}
