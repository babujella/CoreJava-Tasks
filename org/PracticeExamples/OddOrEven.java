 package com.org.PracticeExamples;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur Starting Number :");
		int firstnumber=scanner.nextInt();
		System.out.println("Enter ur Last number :");
		int LastNumber=scanner.nextInt();
		for(int i=firstnumber;i<=LastNumber;i++) {
			if(i%2==0) {
				System.out.println(""+i+"The number is  Even ");
			}
			else if(i%2!=0) {
				System.out.println(""+ i+ "The number is Odd");
			}
		}
	}
}
