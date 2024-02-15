package com.interview;

public class RemoveStringSpace {
	
	public static void main(String[] args) {
		
		String s = "Welcome to Java Class";
		String s1 =" ";
		
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isWhitespace(s.charAt(i))) {
				s1 += s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
