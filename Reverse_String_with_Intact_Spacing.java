package com.leetCode;

class Admin {
	static String reverseWithIntactSpacing(String s) {
		// write code here
		int start = 0, end = s.length() - 1;
		while (start < end) {
			char first = s.charAt(start);
			char last = s.charAt(end);
			if (!Character.isWhitespace(first) && !Character.isWhitespace(last)) {
				
			} else {
				if (Character.isWhitespace(first)) {
					start++;
				}
				if (Character.isWhitespace(last)) {
					end--;
				}
			}
		}

		return "";
	}
}

public class Reverse_String_with_Intact_Spacing {

	public static void main(String[] args) {

		String s = "one piece";
//		System.out.println(Admin.reverseWithIntactSpacing(s));

		System.out.println(s.indexOf('o'));
	}
}
