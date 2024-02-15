package com.interview;

import java.util.Arrays;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		int a[] = {-1,8,-4,0,6,-2,9,5};
//		Arrays.sort(a);
		int passtiveArray[] = new int[8];
		int negativeArray[] = new int[8];
		int passtiveNumber=0, negativeNumber =0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] < 0) {
				negativeArray[negativeNumber] = a[i];
				negativeNumber ++;
			}else {
				negativeArray[passtiveNumber] = a[i];
				passtiveNumber++;
			}
		}
		System.out.print("Passtive Number "+passtiveNumber);
		System.out.print("\nNegative Number "+negativeNumber);
		
		System.out.print("\nPasstive Value ");
		getPassNegative(passtiveArray,passtiveNumber);
		System.out.print("\nNegative Value ");
		getPassNegative(negativeArray,negativeNumber);
		
	}
	public static void  getPassNegative(int[] array, int number) {

		for (int i = 0; i < number; i++) {
			System.out.print(array[i]+", ");
		}
	}

}
