package com.assignment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter date :");
		String date = sc.next();
		System.out.print("Enter number to add date :");
		int number = sc.nextInt();
		System.out.println(addTwoDates(date, number));
	}
	private static LocalDate addTwoDates(String date, int number) {
		LocalDate locDate = LocalDate.parse(date);
		LocalDate addLocDate = locDate.plusDays(number);
		return addLocDate;
	}
}
