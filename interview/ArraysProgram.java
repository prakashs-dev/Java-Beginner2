package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysProgram {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
		n = sc.nextInt();
        int []arrA=new int[n];
        for(int i=0;i<n;++i){
                arrA[i]=sc.nextInt();
        }
        
        n = sc.nextInt();
        int []arrB=new int[n];
        for(int i=0;i<n;++i){
            arrB[i]=sc.nextInt();
        }
        
        System.out.println(ArrayProblem(arrA,arrB)); 
    }
    public static String ArrayProblem(int []arrA,int []arrB){
       // Write code here
		String arrayProblem = "";
		int nCount = 0;
		int mCount = 0;
		for(int i = 0; i < arrA.length; i++){
			nCount += arrA[i];
		}
		
		for(int i = 0; i < arrB.length; i++){
			mCount += arrB[i];
		}
		
		if(nCount > mCount){
			arrayProblem = "First array is larger";
		}else if(mCount > nCount){
			arrayProblem = "Second array is larger";
		}else{
			arrayProblem = "Both are equal";
		}
		return arrayProblem;
		
    }
}
