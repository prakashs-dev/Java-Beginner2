package com.zoho;

import java.util.Stack;
import java.util.List;

public class BalancedBrackets {

	public static void main(String[] args) {

		String s = "{{[[(())]]}}";
//			System.out.println(isBalanced(s));
			System.out.println(0-0);
//			Left Rotation Array
		int[] ar = { 1, 2, 3, 4, 5 };
		int d = 2;
		List<Integer> list = (rotateLeft(ar, d));
	}

	private static List<Integer> rotateLeft(int[] ar, int d) {

		if (d > ar.length) {
			d = ar.length / d;
		}
		int[] a = new int[ar.length];
		return null;
	}

	private static String isBalanced(String s) {

		Stack<Character> st = new Stack<>();
		boolean flag = true;
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} else {
				if (st.empty()) {
					flag = false;
					break;
				}
				char top = st.peek();
				if (ch == ')' && top == '(' || ch == ']' && top == '[' || ch == '}' && top == '{') {
					st.pop();
				} else {
					flag = false;
					break;
				}
			}
		}
		return (flag == false || !st.empty()) ? "NO" : "YES";
	}

}
