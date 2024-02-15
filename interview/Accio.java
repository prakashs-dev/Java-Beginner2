 package com.interview;

public class Accio {

//	public int calculateAvg(int[] arr, int n) {
//		int res = 0;
//		int sum = 0;
//		for(int i=0; i <= arr.length; i++){
//			sum = sum + arr[i];
//		}
//		res = sum / n;
//		return res;
//	}

	public static int TRAILINGZEROES(int n) {
		
		int count = 0;
		long fact = 1;
		for(int i=1; i <= n; i++){
			fact *= i;
			while(fact > 0){
				long d = fact % 10;
				if(d == 0){
					count += 1;
				}else{
					break;
				}
				fact = fact / 10;
			}
		}
		
		return count;
	}

}
