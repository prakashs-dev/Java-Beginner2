package com.leetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem344 {

	public static void main(String[] args) {
//		char s[] = {"h","e","l","l","o"};
//		204. Count Primes
//		238. Product of Array Except Self
//		
		int a[] = {1 ,3, 5, 6};
				int b = 2;
	
		int index = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                index = i;
            }else if(a[i] < b){
                index = i+1;
            }
        }
       
        System.out.println(index);
        Set<Integer> set = new HashSet<>();
		
	}
}
