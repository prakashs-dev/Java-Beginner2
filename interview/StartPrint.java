package com.interview;

public class StartPrint {
	
	public static void main(String[] args) {
		
		int num=1;
		int ch = 65;
		char alpha = (char)ch;
//		Right Triangle Star Pattern
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j >= i; j++) {
				System.out.print( alpha++ +" ");
			}
			System.out.println();
		}
//		System.out.println(" ");
//		Downward Triangle Star Pattern
//		for (int i = 5-1; i >= 0; i--) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
		
	}
}
