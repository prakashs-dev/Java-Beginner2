package com.arrayspackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Solution {

	public static int[] sumoftwoarray(int[] a, int[] b) {

		int n = a.length, m = b.length;
		int max = Math.max(n, m);
		
		List<Integer> list = new ArrayList<>();
		int carry = 0;
		for (int i = 0; i < max || carry != 0; i++) {
			int digitA = (i < n) ? a[n - i - 1] : 0;
			int digitB = (i < m) ? b[m - i - 1] : 0;
			
			int sum = digitA + digitB + carry;
			list.add(sum%10);
			carry = sum / 10;
		}
		
		Collections.reverse(list);
		
		int twoarry[] = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			twoarry[i] = list.get(i);
		}
		return twoarry;
	}
}

public class SumofTwoArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6, 7 };
		
		int result[] = Solution.sumoftwoarray(a, b);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+ " ");
		}
	}
}
