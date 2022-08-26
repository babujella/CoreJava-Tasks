package com.org.my;

import java.util.Scanner;

public class MyClass {
	public enum Week{
		SUN,MON
	}
	public static void main(String[] args) {
		boolean b=true;
		while(b) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter :");
			String input=sc.next();

			Week week=Week.valueOf(input.toUpperCase());
			//			if(week == Week.values()) {
			if((Week.values()).equals(week)){
				//	try {
				switch (week) {
				case SUN:
					System.out.println("Sunday");
					break;

				case MON:
					System.out.println("Monday");
					break;
				}
				//			catch(IllegalArgumentException e) {
				//				System.out.println("Unexpected value: " +  e  );
				//			}
			}
		}
	}
}