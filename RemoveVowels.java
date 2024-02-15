package com.leetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

	public static void main(String[] args) {

		String s = "Compuuter";
//		System.out.println(removeVowels(s));

		int[] ar = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		int[] res = mergeSortedArray(ar, arr);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	private static int[] mergeSortedArray(int[] ar, int[] arr) {
		Set<Integer> hs = new HashSet<>();
		for (int i : ar) {
			hs.add(i);
		}
		for (int i : arr) {
			hs.add(i);
		}
		int[] ans = new int[hs.size()];
		int index = 0;
		for (int i : hs) {
			ans[index++] = i;
		}
		return ans;
	}

	private static String removeVowels(String s) {
		StringBuffer sb = new StringBuffer();
		for (char ch : s.toLowerCase().toCharArray()) {
			if (!isVowels(ch))
				sb.append(ch);
		}
		return sb.toString();
	}

	private static boolean isVowels(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}
