package com.interview;

import java.util.*;
public class MyArrays {
	
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	   // int a[] = new int[5];
	   // a[0] = 10;
	   // a[1] = 11;
	   // a[2] = 12;
	   // for(int i=0; i < a.length; i++){
	   //     System.out.println(a[i]+" index of "+i);
	   // }
	    
	   // int n = sc.nextInt();
	   // int a[] = new int[n];
	   // int total = 0;
	   // for(int i = 0; i < a.length; i++){
	   //     a[i] = sc.nextInt();
	   //     total++;
	   // }
	   // System.out.println(Arrays.toString(a)+" index of "+ total);
	    
	    
	   // Count even numbers in array 
	   
	   //int n = sc.nextInt();
	   //int a[] = new int[n];
	   //int count = 0;
	   
	   //for(int i = 0; i < n; i++){
	   //    a[i] = sc.nextInt();
	   //    if (a[i] % 2 == 0)
	   //        count += 1;
	   //}
	   //System.out.print("Even count "+count);
	    
	   // sum of array Heap Method/dynamic memory allocation
	   
	   //int n = sc.nextInt();
	   //int a[] = new int[n];
	   //int sum = 0;
	   //for(int i = 0; i < n; i++){
	   //    a[i] = sc.nextInt();
	   //    sum += a[i];
	   //}
	   //System.out.print("Sum of Arrays are "+sum);
	    
	    
	    // sum of array Stack Method/Static memory allocation
	    
	   // int a[] = {1,2,3,4,5};
	   // int sum = 0;
	   // for(int i = 0; i < a.length; i++){
	   //    sum += a[i];
	   // }
	   // System.out.println(sum);
	    
	    
	   // Find even numbers in array Stack Method/Static memory allocation
	   
	   //int a[] = {1,3,2,5};
	   //int even = 0;
	   //for(int i = 0; i < a.length; i++){
	   //    if(a[i] % 2 == 0)
	   //        even = a[i];
	   //}
	   //System.out.println(even);
	    
	    // Find even numbers in array Heap Method/dynamic memory allocation
	    
	   // int n = sc.nextInt();
	   // int a[] = new int[n];
	   // int even = 0;
	   // for(int i = 0; i < n; i++){
	   //     a[i] = sc.nextInt();
	   //     if(a[i] % 2 == 0)
	   //         even  = a[i];
	   // }
	   // System.out.println("Find Even "+even);
	   
	   
	   // Freq of number in array 
	   System.out.print("Enter number ");
	   int n = sc.nextInt();
	   System.out.print("Frequrency of number ");
	   int f = sc.nextInt();
	   int a[] = new int[n];
	   int freq = 0;
	   
	   for(int i = 0; i < n; i++){
	       a[i] = sc.nextInt();
	       if(a[i] == f)
	            freq += 1; 
	   }
	   System.out.println("Frequrency of number "+freq);
	    
	}
}


