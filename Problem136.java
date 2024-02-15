package com.leetCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Problem136 {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 1, 0, 1, 99 };

		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (!set.add(i)) {
				set.remove(i);
			}
		}
		Iterator<Integer> it = set.iterator();
		System.out.println(it.next());
	}
}
