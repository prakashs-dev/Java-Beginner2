package com.interview;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.print("Enter Your Option ");
		int n = sc.nextInt();
		
		switch (n) {
		case 1: amountDeposit(sc);
				break;
		case 2: amountWithdraw(sc);

		default:
			break;
		}
	}

	private static void amountWithdraw(Scanner sc) {
		System.out.print("Enter your withdraw amount ");
		int withdraw = sc.nextInt();
		System.err.println("Your Amount Successfully Withdraw "+withdraw);
	}

	private static void amountDeposit(Scanner sc) {
		System.out.print("Enter your deposit amount ");
		int deposit = sc.nextInt();
		System.err.println("Your Amount Successfully Deposited "+deposit);
	}

}
