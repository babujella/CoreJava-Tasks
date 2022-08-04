package com.org.PracticeExamples;

import java.util.Scanner;

public class UsingDifferLoops {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur number :");
		int number=scanner.nextInt();
		System.out.println("Using for loop : ");
		for(int i=1;i<=number;i++) {
			System.out.print(" "+i);
		}
		System.out.println("Using while loop :");
		int i = 1;
		while(i<=number) {
			System.out.print(" "+i);
			i++;
		}
		System.out.println("Using do while loop :");
		int j=1;
		do {
			System.out.print(" "+j);
			i++;
		}while(j<=number);
	}
}
