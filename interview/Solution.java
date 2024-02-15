package com.interview;

public class Solution {

	public static int a;
	public static int b;

	public Solution(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}

	public static Solution swap(Solution solution) {
		// TODO Auto-generated method stub
		a = a - b;
		b = a + b;
		a = b - a;
		return solution;
	}

	

}
