package com.interview;

import java.util.Arrays;
import java.util.Collections;

public class NewArray {
	
	public static void main(String[] args) {
		
		String []names = {"Mary","John","Emma"};
		Integer []heights = {180,165,170};
		
		Arrays.sort(heights,Collections.reverseOrder());
		System.out.println(Arrays.toString(heights));
		
//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i]+" ");
//		}
		
		
		
	}
}
