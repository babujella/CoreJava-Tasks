package com.org.PracticeExamples;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter number :");
			int number=scanner.nextInt();
			int factorial=1;
			for(int i=2;i<=number;i++) {
				factorial=factorial*i;
			}
			System.out.println(factorial);
		}
	}
}
