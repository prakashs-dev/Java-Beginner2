package com.leetCode;

public class ReverseWordsString3 {

	public static void main(String[] args) {
		
//		sb.append("LeetCode");
//		String s = sb.reverse().toString();
//		System.out.println(s);
		
		String s = "Let's take LeetCode contest".trim();
		StringBuilder sb = new StringBuilder();
		String str[] = s.split("\\s");
		String result = "";
		for (int i = 0; i < str.length; i++) {
			String sr = sb.append(str[i]).reverse().toString();
			System.out.println(sr);
//			result += sr;
		}
		System.out.println(result);
		
	}
}
