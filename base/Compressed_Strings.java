package com.base;

import java.util.ArrayList;

public class Compressed_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbbccd";
		
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)) {
				count++;
				i++;
			}
			if(count == 1) {
				System.out.print(s.charAt(i));
			}else {
				System.out.print(s.charAt(i));
				System.out.print(count);
			}
			
		}

	}

}
