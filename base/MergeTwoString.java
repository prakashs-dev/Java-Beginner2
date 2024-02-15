package com.base;

import java.util.Scanner;

public class MergeTwoString {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
	    String s1 = "abbadab", 
	    		s2 = "acfpf";
	    System.out.println(mergeStrings(s1, s2));
	}

	public static String mergeStrings(String s1, String s2) {
	
		String ans = "";
		for(int i = 0; i < s1.length()||i < s2.length(); i++){
			if(i < s1.length()) {
				ans += s1.charAt(i);
			}
			if(i < s2.length()) {
				ans += s2.charAt(i);
			}
		}
		return ans;
		
	}

}
