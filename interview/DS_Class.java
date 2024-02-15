package com.interview;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class DS_Class {

	public static void main(String[] args) {
		/*
		 * Stack<Integer> st = new Stack<>();
		 * 
		 * boolean isEmpty = st.isEmpty(); System.out.println(isEmpty);
		 * 
		 * st.push(10); st.push(20); st.push(30);
		 * 
		 * System.out.println(st); // output represented by array int remove = st.pop();
		 * // remove last value System.out.println(remove); System.out.println(st);
		 * System.out.println(st.peek()); // last insert value
		 * 
		 * ASCII code number 0-9 => 48 - 57 A-Z => 65-90 a-z => 96-122
		 */
//
//		try {
//			someMethod();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println("Caused by: " + e.getCause().getMessage());
//		}
//
//	}
//
//	static void someMethod() throws Exception {
//		try {
//			// Some code that throws an exception
//			String s = null;
//			int n = s.length();
////			throw new RuntimeException("Initial exception");
//		} catch (ArithmeticException | NullPointerException e) {
//			throw new Exception("New exception", e); // Chain the caught exception
//		}
		
		
		int n = 5;
//		for (int i = 0; i < n; i++) {
//			int ch = i;
//			for (int j = 1; j <= i+1; j++) {
//				if(ch > 25) {
//					ch = ch % 26;
//				}
//				System.out.print((char)(ch+65));
//				ch++;
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < i+1; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		int f = n/2+1;
		int s = n/2;
		for (int i = 1; i <= f; i++) {
			for (int k = 1; k <= n-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = s; i >= 0; i--) {
			for (int k = 1; k <= n-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
