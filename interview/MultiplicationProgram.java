package com.interview;

import java.util.Scanner;

public class MultiplicationProgram {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a table ");
		int a = sc.nextInt();
		System.out.println("Enter your Multiplication");
		int b = sc.nextInt();
		int c;
		for (int i = 1; i <= b; i++) {
			 c = a * i;
			System.out.println(a+" x "+i+" = "+c);
		}
		
	}

}
