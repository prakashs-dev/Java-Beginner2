package com.interview;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int a =12321, n, i=0, j=0;
		n = a;
		while (n > 0) {
			 i = a%10;
			 j = (j*10)+i;
			 a = a/10;
		}
		if (a == j) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
