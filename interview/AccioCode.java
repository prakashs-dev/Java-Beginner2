package com.interview;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AccioCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		double var =  10.45;
//		var = (float) 20.55;
//		System.out.print(var);

//		int a = 10, b = 20,sum;
//		System.out.print(sum=a+b);

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a Number");
//        int r = input.nextInt();
//        // Write your code here
//		float area = (float)3.14 * r * r;
//		float perimeter = 2 * (float)3.14 * r;
//		System.out.println((int)area);
//		System.out.println(perimeter);

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please number of rows ");
//		int myrows = scanner.nextInt();
//		for (int m = 1; m <= myrows; m++)
//		{
//		for (int n=myrows; n>m; n--)
//		{
//		System.out.print(" ");
//		}
//		for (int p=1; p<=(m * 2) -1; p++)
//		{
//		System.out.print("*"+" ");
//		}
//		System.out.println();
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number A and B");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		AccioCode.solve(a,b);
//		
//	}
//
//	 static void solve(int a, int b) {
//		 int sum = a + b;
//		 if(sum == 10 || a == 10 || b == 10) {
//			 System.out.println("Yes");
//		 }else {
//			 System.out.println("No");
//		 }

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Month and Year");
//		int m = sc.nextInt();
//		int y = sc.nextInt();
//		boolean leapYear = false;
//		
//		if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0))
//			leapYear = true;
//		
//		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
//			System.out.println("31");
//		}else if(m == 4 || m == 6 || m == 9 || m == 11) {
//			System.out.println("30");
//		}else {
//			if(leapYear){
//				System.out.println("29");
//			}else {
//				System.out.println("28");
//			}
//		}

//		for(int i=1; i <= 10; i++){
//			System.out.println(i);
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number to table");
//		int input = sc.nextInt();
//		System.out.println("Enter a Number to Multiplication");
//		int range = sc.nextInt();
//		
//		for (int i = 1; i <= range; i++) {
//			int a = i * input;
//			System.out.println(input+" x "+i+" = "+a);
//		}

		// CELSIUS TO FAHRENHEIT
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Celsius");
//        int C = sc.nextInt();
//        sc.close();
//		double fahrenheit = C * 1.8+32;
//		Formatter fm = new Formatter();
//		fm.format("%.6f", (float)fahrenheit);
//		System.out.println(fm);

//		float f= 1.23231245f;
//		 
//        Formatter fm = new Formatter();
//        fm.format("%.6f", f);
//        //  Print float to 2 decimal places using Formatter
//        System.out.println("Float upto 2 decimal places: " + fm.toString());

//		String s = "THE LAZY DOG";
//		System.out.println(s.toLowerCase());

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int data = sc.nextInt();
//		int sum = 0, digit;
//		while(data > 0) {
//			digit = data % 10;
//			sum = sum + digit;
//			data = data /10;
//		}
//		System.out.println(sum);

//		int num = 30;
//		
//		switch (num) {
//		case 28 :
//			System.out.println("I m a young ");
//			break;
//		case 30:
//			System.out.println("I m not young");
//			break;
//			default:
//				System.out.println("Read the Manul");
//		}

//		int a = 1, b = 4;
//		if(a%2 !=0) {
//			if(b%2 != 0) {
//				System.out.println("we are odd");
//			}else {
//				System.out.println("we are simple");
//			}
//		}else {
//			System.out.println("we are simple");
//		}

//		
//		class Solution{
//		    List<Integer> get(int a,int b){
//		        // Write your code here
//				a = a + b;
//				b = a - b;
//				a = b - a;
//				return 	a ;
//		    }
//		}
////		public class Main{
////		    public static void main(String args[]){
//		        Scanner sc = new Scanner(System.in);
//		        int a = sc.nextInt();
//		        int b = sc.nextInt();
//		        Solution ob = new Solution();
//		        List<Integer> ans = ob.get(a,b);
//		        System.out.println(ans.get(0)+" "+ans.get(1));

//		float f = 123.56576f;
//		 System.out.println(f);   

//		 Scanner sc = new Scanner(System.in);
//	        int a = sc.nextInt();
//	        int b = sc.nextInt();
//	        AccioCode obj= new AccioCode();
//	        obj.concatenate(a, b);	
//		
//	}
//
//	public void concatenate(int a, int b) {
//		// TODO Auto-generated method stub
//		String s1 = Integer.toString(a);
//		String s2 = Integer.toString(b);
//		System.out.println(s1+s2);

//		char c = 'a';
//		String s = Character.toString(c);
//		String upper = s.toUpperCase();
//		System.out.println(upper);
//		
//		switch(upper){
//		case "A":
//			System.out.print("I am the first letter");
//			break;
//		case B:
//			System.out.print("I am the second letter");
//			break;
//		case C:
//			System.out.print("I am the third letter");
//			break;
//		case D:
//			System.out.print("I am the fourth letter");
//			break;
//		case E:
//			System.out.print("I am the fifth letter");
//			break;
//		default:
//			System.out.print("I don't belong here");
//	}

//		Scanner sc = new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        
//        if(ch >= 'A' && ch <= 'Z') {
//        	System.out.println("1");
//        }else if(ch >= 'a' && ch <= 'z') {
//        	System.out.println("0");
//        }else {
//        	System.out.println("-1");
//        }

//		(a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.

//		long a = 44558;
//		long b = 38594;
//		long LHS = (long)Math.pow(a+b, 3);
//		long RHS = (long)(Math.pow(a, 3)+Math.pow(b, 3)+ 3* Math.pow(a, 2)*b+ 3*a* Math.pow(b, 2));
//		
//		if(LHS == RHS) {
//			System.out.println(LHS);
//			System.out.println(RHS);
//			System.out.println("VERIFIED");
//		}else {
//			System.out.println("NOT VERIFIED");
//		}

//		int radius = 500;
//		double area = Math.PI * radius * radius;
//		float perimeter =  (float)(2 * Math.PI * radius);
//        perimeter = (float) (perimeter / area) ; 
//        System.out.println(perimeter);
//        System.out.println(area);

//		int sum =0, n=13;
//		for (int i = 1; i <= n; i++) {
//			if(i % 2 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.println(sum);

//		double n = 123.35546352;
//		System.out.printf("%.4f",n);

//		        Scanner scanner = new Scanner(System.in);
//		        int count = 0;
//		        while (true) {
//		            int number = scanner.nextInt();
//		            count++;
//
//		            if (number % 2 != 0) {
//		                break;
//		            }
//		        }
//		        System.out.println(count);

//		int n = 16;
//		int count = 0;
//		for (int i = 2; i < n/2; i++) {
//			if (n % i == 0) {
//				count = 1;
//			}
//		}
//		if(count == 0) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("Not Prime");
//		}

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=0,j=0;
//		while(n > 0) {
//			i = n % 10;
//			j = (j*10)+i;
//			n = n / 10;
//		}
//		System.out.println(j);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a character");
//		char c = sc.next().charAt(0);
//		int n = c ;
//		System.out.println("ASCII char "+"\'"+c+"\'"+" is value of "+n);

//		String s = "Hello";
//		String rev ="";
//		for (int i = s.length()-1; i > s.length(); i--) {
//			rev = s;
//		}
//		System.out.println(rev);

//		int n = 25;
//		int n1 = 50;
//		int hcf = 0;
//		for (int i = 1; i <= n || i <= n1; i++) {
//			if(n % i == 0 && n1 % i == 0) {
//				hcf = i;
//			}
//		}
//		System.out.println(hcf);

		// FAHRENHEIT TO CELSIUS
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter fahrenheit");
//        int fahrenheit = sc.nextInt();
//		double celsius = (fahrenheit-32)*5/9;
//		System.out.println(celsius);

		// SUM EVEN ODD
//		Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int n = sc.nextInt();
//        int even=0, odd=0;
//        
//        for (int i = 0; i < n; i++) {
//        	int n1 = sc.nextInt();
//        	if(n1 % 2 == 0) {
//        		even += n1;
//        	}else {
//        		odd += n1;
//        	}
//		}
//        System.out.println("Even "+even+" odd "+odd);

//		WHICH ANGLED TRIANGLE
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a, b, c value");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		if(tringle(a,b,c) == 1) {
//			System.out.println("1"); //acute
//		}else if(tringle(a,b,c) == 2) {
//			System.out.println("2"); // right
//		}else {
//			System.out.println("3"); //obtuse
//		}
//	}
//
//	private static int tringle(int a,int b,int c) {
//		double max = Math.max(Math.max(a, b), c);
//		int squareMax = (int)(max * max);
//		double sumOfSquare = a*a + b*b + c*c;
//		
//		if(2*squareMax < sumOfSquare) {
//			return 1;
//		}else if(2*squareMax > sumOfSquare) {
//			return 3;
//		}else {
//			return 2;
//		}

		// Factorial with loop
//		
//		int n = 13;
//		long factSum=1;
//		
//		for (int i = 1; i <= n; i++) {
//			factSum = factSum * i ;
//		}
//		System.out.println(factSum);

		// PreIncrement & PostIncrement
//		int a = 10;
//		int b = ++a + a + --a + a++ + a;
//		System.out.println(b);

//		Reverse of Number
//		System.out.println("Enter a Number");
//		int num = sc.nextInt();
//		int reverse = 0;
//		String reveString="";
//		while(num > 0) {
//			int rem = num % 10;
//			reveString = reveString + Integer.toString(rem);
//			 num = num / 10;
//		}
//		System.out.println(reveString);

//		StringBuffer
//		String str = "Today";
//		str.concat("Class");
//		System.out.println(str);
//		
//		StringBuffer sb = new StringBuffer(str);
//		sb.append("Class");
//		System.out.println(sb);
//		

//		System.out.println("Enter range of number");
//		int r = sc.nextInt();
//		int even=0, odd=0,count=0;
//		for (int i = 1; i <= r; i++) {
//			int r1 = sc.nextInt();
//			count++;
//			if(r1 % 2 !=0) {
//				break;
//			}
//		}
//		System.out.println(count);
//		System.out.println("Even "+even+" ODD "+odd);

//		Armstrong Numbers in Range
//		System.out.println("Enter a from range of Armstrong");
//		int m = sc.nextInt();
//		System.out.println("Enter a to range of Armstrong");
//		int n = sc.nextInt();
//		System.out.println("Armstrong numbers between " + m + " and " + n + ":");
//		
//		for (int i = m; i <= n; i++) {
//			if(Armstrong(i)) {
//				System.out.print(i+" ");
//			}
//		}
//	}
//
//	private static boolean Armstrong(int i) {
//		int num = i;
//		int countNum = count(num);
//		int sum=0;
//		while(i > 0) {
//			int digit = i % 10;
//			sum = sum + (int) Math.pow(digit, countNum);
//			i = i /10;
//		}
//		return sum == num;
//	}
//
//	private static int count(int num) {
//		int count=0;
//		while(num > 0) {
//			num = num/10;
//			count++;
//		}
//		return count;

//		Optimus Prime
//		int n = 50000;
//		for(int a = 1; a <= n; a++){
//			int b = a;
//			long count = 0;
//			for(int c = 1; c <= b; c++){
//				if(b % c == 0){
//					count = count + 1;
//				}
//			}
//			if(count == 2){
//				System.out.println(b);
//			}
//		}

//		Reverse Number

//		Last Digit Even
//		System.out.println("Enter a Number");
//		int n = sc.nextInt();
//		while(n > 0) {
//			int d = n % 10;
//			if(d % 2 ==0) {
//				System.out.println(1);
//			}else {
//				System.out.println(0);
//			}
//		}

//		TRAILING ZEROES
//	    System.out.println("enter a number");
//	    int num = sc.nextInt();
//	    sc.close();
//	    
//	    long fact = 1;
//	    int count = 0;
//	    
//	    for(int i = 1;i<=num;i++){
//	        fact *= i; 
//	        while(fact > 0){
//	            long d = fact % 10;
//	            if(d == 0){
//	                count += 1;
//	            }else{
//	                break;
//	            }
//	            fact = fact / 10;
//	        }
//	    }
//	    
//	    System.out.println("Factrial "+fact);
//	    System.out.println("Count "+count);

//		AverageCalc
//	        int n = sc.nextInt();
//	        int[] arr = new int[n];
//	        for(int i = 0; i < n; ++i) {
//	            arr[i] = sc.nextInt();
//	        }
//	        Accio Obj = new Accio();
//	        System.out.println(Obj.calculateAvg(arr, n));

//		TRAILING ZEROES
//		int n = sc.nextInt();
//        Accio obj = new Accio();
//        int ans = obj.TRAILINGZEROES(n);
//        System.out.println(ans);

//		Maximum times element

//		int n = sc.nextInt();
//		int arr[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            int x=sc.nextInt();
//            arr[i]=x;
//        }
//        
//        int majority = n/2;
//        int count = 1;
//        
//        for (int i = 0; i < arr.length; i++) {
//			if(majority == arr[i]) {
//				count++;
//			}else {
//				count--;
////				if(count == 0) {
////					majority = num[i];
////				}
//			}
//		}
//		int n = sc.nextInt();
//		for(int i = 1; i <= n; i++){
//			for(int k = 1; k <= n-i; k++){
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= 2*i-1; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i = n-1; i >= 1; i--){
//			for(int k = 1; k <= n-i; k++){
//				System.out.print(" ");
//			}
//			for(int j = 1; j <= 2*i-1; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		int n = sc.nextInt();
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}
}
