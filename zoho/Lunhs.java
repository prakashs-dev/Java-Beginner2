package com.zoho;

import java.util.Iterator;
import java.util.Scanner;

public class Lunhs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number: ");
//        long number = scanner.nextLong();

		System.out.println(ismatch("aa",".*"));
//        boolean matches = "*".matches("\\.\\*");
//        System.out.println(matches==true? Boolean.TRUE : Boolean.FALSE);
//        int checksumDigit = calculateChecksumDigit(number);

//        System.out.println("Checksum digit: " + checksumDigit);
		pattern("3");
    }

	private static boolean ismatch(String s, String p) {
		 int m = s.length();
	        int n = p.length();

	        boolean[][] dp = new boolean[m + 1][n + 1];
	        dp[0][0] = true;

	        for (int j = 1; j <= n; j++) {
	            if (p.charAt(j - 1) == '*') {
	                dp[0][j] = dp[0][j - 2];
	            }
	        }

	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                char sc = s.charAt(i - 1);
	                char pc = p.charAt(j - 1);

	                if (pc == '.' || sc == pc) {
	                    dp[i][j] = dp[i - 1][j - 1];
	                } else if (pc == '*') {
	                    dp[i][j] = dp[i][j - 2] || (dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.'));
	                }
	            }
	        }

	        return dp[m][n];
		// TODO Auto-generated method stub

	}
	
	private static void pattern(String n) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(n);
		for(int i= 1 ; i <= num; i++) {
			for (int k = 1; k <= num-i; k++) {
				System.out.print("*");
			}
			for (int j = num; j <= num; j--) {
				System.out.print(j);
			}
			for (int k = 1; k <= num-i; k++) {
				System.out.print("*");
			}
		}

	}
    private static int calculateChecksumDigit(long number) {
        // Convert the number to a string to access individual digits
        String numberStr = Long.toString(number);

        int sum = 0;

        // Iterate through each digit in reverse order
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numberStr.charAt(i));

            // Double the digits at even positions
            if ((numberStr.length() - i) % 2 == 0) {
                digit *= 2;

                // Subtract 9 if the result is >= 10
                if (digit >= 10) {
                    digit -= 9;
                }
            }

            sum += digit;
        }

        // Calculate the checksum digit
        int checksumDigit = (sum % 10 == 0) ? 0 : (10 - (sum % 10));

        return checksumDigit;
	}

}
