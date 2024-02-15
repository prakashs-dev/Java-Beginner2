package com.interview;

public class ArraryMinMax {

	public static void main(String[] args) {
		
//		 int arr[] = {16,24,89,35};
		 int arr[] = {9, 1, 2, 8, 7};
		 int min = arr[0];
		 int max = 0;
		  int diff = 0;
		 for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}else if (arr[i] < min) {
				min = arr[i];
			}
			 diff = max - min;
		}
		
		 System.out.println("max "+max+" min "+min+" ==> "+diff);
		 
		 //Array Sec Largest Number
		 
//		 int secLar = arr[0];
//		 int firstLar = arr[0];
//		 
//		 for (int i = 0; i < arr.length; i++) {
//			 if (arr[i] > firstLar) {
//				 secLar = firstLar;
//				firstLar = arr[i];
//			}else if (arr[i] > secLar) {
//				secLar = arr[i];
//			}
//		}
//		 
//		 System.out.println("Secound Largest Number "+secLar);
		 
		 
	}
}
