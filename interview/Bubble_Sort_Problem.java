package com.interview;
import java.util.*;

public class Bubble_Sort_Problem
 {
	/*  Question :
	 * 				Number of swaps it took to sort the array using the above algorithm.
	   				First element in the array after sorting the array.
	   				Last element in the array after sorting the array.
	 * 
	 * Input :: 3
				6 4 1
				
	   Output :: 3 1 6
	 */
    static void bubbleSort(int a[], int n)
    {
        //Write your code here
    	int count = 0;
    	for(int i = 0; i < n; i++) {
    		for (int j = 0; j < n-1; j++) {
				if(a[j] > a[j+1]) {
					count++;
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
    	}
    	System.out.println("Swap count "+count);
    	System.out.println("Array first num "+a[0]);
    	System.out.println("Array last num "+a[n-1]);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size ");
        int n = sc.nextInt();
        System.out.println("Array Elements");
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
       bubbleSort(arr1, n);
    }
}
