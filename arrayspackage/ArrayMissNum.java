package com.arrayspackage;

public class ArrayMissNum {
	
	public static void main(String[] args) {
		
		int arr[] =  {9,6,4,2,3,5,7,0,1};
		
		int sum = arr.length *( arr.length + 1)/2;
		System.out.println(sum);
		int misNum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			misNum = misNum + arr[i]; 	
		}
		System.out.println(misNum);
		System.out.println("Missing Number :"+(sum-misNum));
		
		
		
		
	}

}
