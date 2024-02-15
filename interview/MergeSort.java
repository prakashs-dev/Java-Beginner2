package com.interview;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int a[] = {20,80,30,60,10,20};
		int a1[] = {70,50,40,90,100};
		int finalarray[] =  new int[a.length+a1.length];
		System.arraycopy(a, 0, finalarray, 0, a.length);
		System.arraycopy(a1, 0, finalarray, a1.length, a1.length);
		
		Arrays.sort(finalarray);
		for (int ele : finalarray) {
			System.out.print(ele+", ");
		}
		
	}

}
