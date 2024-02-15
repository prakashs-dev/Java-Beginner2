package com.leetCode;

import java.util.Arrays;

class problem {

	public static double average(int[] salary) {

		Arrays.sort(salary);
		double sum = 0;
		for (int i = 1; i < salary.length - 1; i++)
			sum += salary[i];
		return sum / (double) (salary.length - 2);
	}

}

public class leetcode1491 {

	public static void main(String[] args) {
		int salary[] = { 1000, 2000, 3000 };
		double result = problem.average(salary);
		System.out.println(result);
	}
}
