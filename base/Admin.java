package com.base;

import java.util.Stack;

public class Admin {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		boolean isAvailable  = stack.isEmpty();
//		System.out.println(isAvailable);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);//add the values on the stack
		
//		System.out.println(stack);
		
		//stack.pop();//remove the top of the stack value
//		System.out.println(stack);
//		
//		System.out.println(stack.size());//get the size stack
//		
//		System.out.println(stack.peek());//get element from top of the stack
//		
//		int sum = 0;
//		int n = 100;
//		for (int i = 0; i < stack.size(); i++) {
//			stack.push(n);
//			n = n + 100;
//		}
//		
//		System.out.println(stack);
		
//		char top = '(';
//		System.out.println(top);
		
		String s = "(())";
		Stack<Character> st = new Stack<>();
		
		
	}
}
