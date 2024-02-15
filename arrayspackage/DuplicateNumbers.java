package com.arrayspackage;

public class DuplicateNumbers {
	
	private static void getDuplicateNum() {

		int[] arr = {1,2,3,3,4,5,6,2,6,8,90,5,7};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print("\n Array of Duplicate Number is "+arr[j]+", ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		getDuplicateNum();
	}

}
