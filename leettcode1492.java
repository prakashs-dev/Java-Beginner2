package com.leetCode;

import java.util.ArrayList;

public class leettcode1492 {

	public static void main(String[] args) {
		int n = 12, k = 3;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		System.out.println(list);
		if(list.size() >= k) {
			System.out.println(list.get(k-1));
		}else {
			System.out.println(-1);
		}
		
		
	}
}
