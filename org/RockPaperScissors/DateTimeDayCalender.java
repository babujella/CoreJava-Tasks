package com.org.RockPaperScissors;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class DateTimeDayCalender {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date :");
		int date=sc.nextInt();
		System.out.println("Enter the month :");
		int month=sc.nextInt();
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		Calendar calender =Calendar.getInstance();
		calender.set(Calendar.DATE,date);
		calender.set(Calendar.MONTH,month-1);
		calender.set(Calendar.YEAR, year);
		
		System.out.println("The Day is : "+calender.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.LONG, new Locale("en", "US")).toUpperCase());
	}
}