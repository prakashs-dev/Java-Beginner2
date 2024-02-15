package com.multithreads;

import java.util.Scanner;

public class SumTwoArray {

	public static void main(String[] args) {

		String[] word1 = { "a", "cb" };
		String[] word2 = { "ab", "c" };
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < word1.length; i++) {
			sb.append(word1[i]);
		}
		for (int i = 0; i < word2.length; i++) {
			sb1.append(word2[i]);
		}
		System.out.println(sb);
		System.out.println(sb1);
		
		if(sb.toString().equals(sb1.toString())) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		
	}

}
