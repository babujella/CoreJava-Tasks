package com.org.PracticeExamples;

import java.util.Scanner;

public class CountingNumbers {
	static int no=1;
	static void Find(int no) {
		no+=2;
	}
	public static void main(String[] args) {
		System.out.println((no));
		Find(no);
		System.out.println(no);

		/*
		 * Scanner sc =new Scanner(System.in); System.out.println("Enter :"); int
		 * number=sc.nextInt(); int count=0; do { // number=number/10; count++;
		 * }while(number>0); System.out.println(count);
		 */
	}
}
