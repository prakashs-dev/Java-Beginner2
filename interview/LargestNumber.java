package com.interview;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Numbers ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int n4= sc.nextInt();
        sc.close();

        if((n1 == n2)&& (n2 == n3) && (n3 == n4)){
        	System.out.println("1");
        }else{
			System.out.println("0");
		}
        
        
	
	}
}
