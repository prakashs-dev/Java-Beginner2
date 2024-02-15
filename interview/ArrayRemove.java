package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRemove {

	public static void main(String[] args) {
		
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Array Size ");
	        int n = sc.nextInt();
	        System.out.println("Array Elements");
	        int a[] = new int[n];
	        for(int i = 0; i < n; i++){
	            a[i] = sc.nextInt();
	        }
	        System.out.print("Array Key ");
	        int k = sc.nextInt();
			int nArray[] = removeFun(a, k);
			
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(nArray));
			
//			System.out.println("Original Arr76ay");
//			for (int i = 0; i < a.length; i++) {
//				System.out.println(a[i]);
//			}
//			System.out.println("New Array");
//			for (int i = 0; i < nArray.length; i++) {
//				System.out.print(nArray[i]);
//			}
		
	}
	
	public static int[] removeFun(int[] arr, int key){
	    
	    int nArrays[] = new int[arr.length-1];
	    int index = 0;
	    
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] != key){
	            nArrays[index] = arr[i];
	            index++;
	        }
	    }
	    return nArrays;
	}
}