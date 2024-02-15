package com.base;

public class BaseFile {

	
	public static String nullCheck(String inputStr) {

		String retValue = " ";
		if (inputStr == null || inputStr.trim().length() == 0) {
			return retValue;
		} else {
			return inputStr;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(nullCheck("test"));
		
		String s ="1";
		String s1 ="1";
		String t = s1.concat(s1);
		System.out.println(t);
		
		int i =1;
		int i1 =1;
		int t1 = i+i1;
		System.out.println(t1);
		
	}
}
