package com.leetCode;

public class problem151 {
//Reverse Words in a String

	public static void main(String[] args) {
//		String s = "the sky is blue";
		String s = "a good   example";
		System.out.println(reverseWords(s));

	}

	private static String reverseWords(String s) {

		String str[] = s.trim().split("\\s+");
		String out = "";
		for (int i = str.length-1; i >= 0; i--) {
			out += str[i] + " ";
		}
		return out.trim();
	}
}
