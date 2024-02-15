package com.interview;

import java.util.Scanner;

public class AS_Loops {

	    public static void main(String[] args) throws Throwable {
	        Scanner sc = new Scanner(System.in);
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        int num;
	        while(true) {
	        	if(sc.hasNextInt()) {
	        		num = sc.nextInt();
		        	max = (int)Math.max(max, num);
		        	min = (int)Math.min(min, num);
	        	}else {
	        		char ch = sc.next().charAt(0);
	        		if(ch == 'Y' || ch == 'y') {
		        		num = sc.nextInt();
		        		max = (int)Math.max(max, num);
			        	min = (int)Math.min(min, num);
		        	}else {
		        		break;
		        	}
	        	}
	        }
	        System.out.println("Largest number: "+max);
	        System.out.println("Smallest number: "+min);
	        
	       
	        
	}	  
}