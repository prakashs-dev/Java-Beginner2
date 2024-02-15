package com.leetCode;

import java.util.HashSet;
import java.util.Set;

public class problem541 {

//	541. Reverse String II

	public static void main(String[] args) {

		int arr[] = { 3, 2, 7, 8, 2, 3, 1 };
		allDuplicates(arr);
	}

	private static void allDuplicates(int[] arr) {

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i])) {
				System.out.print(arr[i]+" ");
			}else {
				set.add(arr[i]);
			}
		}
	}
}
