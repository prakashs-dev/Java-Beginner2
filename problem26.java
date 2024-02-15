package com.leetCode;

import java.util.HashSet;
import java.util.Set;

public class problem26 {

	public static void main(String[] args) {
		int num[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(num));
	}

	private static int removeDuplicates(int[] num) {

		Set<Integer> set = new HashSet<>();
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if(set.contains(num[i])) {
				set.remove(num[i]);
			}else {
				set.add(num[i]);
				count++;
			}
		}
		return count;
	}
}
