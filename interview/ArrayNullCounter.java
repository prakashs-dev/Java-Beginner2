package com.interview;

public class ArrayNullCounter {
	
	public static void main(String[] args) {
		
		Integer[] arr = {1,2,3,null,null,null,7,null,8,9,10,null,11,null,null,null};
		int arrNull=0;
		
		for (int i = 1; i < arr.length; i++) {
			Integer arrEt = arr[i];
			if(arrEt == null) {
				arrNull++;
			}
		}
		System.out.println(arrNull);
		
		
	}

}
