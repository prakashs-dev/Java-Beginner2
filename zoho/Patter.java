package com.zoho;

import java.util.Scanner;

public class Patter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Print upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(i - j + 1);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.print(i);
            for (int j = 2; j <= i; j++) {
                System.out.print(i - j + 1);
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}

