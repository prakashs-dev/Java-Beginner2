package com.leetCode;

import java.util.Arrays;
import java.util.OptionalInt;

public class leetcode_2815 {

	public static void main(String[] args) {
		int num = 121;
//		System.out.println(countDigits(num));
		double celsius = 36.50;
//		System.out.println(convertTemperature(celsius));
		
		String s = "jjjj";
		char letter = 'o';
		System.out.println(percentageLetter(s, letter));
	}

	private static int percentageLetter(String s, char letter) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == letter) {
				count++;
			}
		}
		return (int)count * 100 / s.length();
	}

	private static double[] convertTemperature(double celsius) {
//		Kelvin = Celsius + 273.15
//		Fahrenheit = Celsius * 1.80 + 32.00
		
		double kel = celsius +273.15;
		System.out.println(10000 * kel);
		
		return null;
	}

	private static int countDigits(int num) {
		int count = 0;
		int temp = num;
		while (num > 0) {
			int val = num % 10;
			if (temp % val == 0) {
				count++;
			}
			num = num / 10;
		}
		return count;
	}

}
