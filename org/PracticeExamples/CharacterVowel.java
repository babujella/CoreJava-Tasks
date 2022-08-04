package com.org.PracticeExamples;

import java.util.Scanner;

public class CharacterVowel {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur character");
		char character=scanner.nextLine().charAt(0);
		if(character=='A' || character=='E'|| character=='I'||character=='O' ||character=='U'
				|| character=='a' ||character=='e'||character=='i'||character=='o'||character=='u') {
			System.out.println("Ur character : "+character + " is Vowel");
		}else {
			System.out.println("Ur character : "+character + " is Consonent");
		}
		System.out.println();
		System.out.println("Enter ur first number :");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter ur second Number :");
		int secondNumber=scanner.nextInt();
		if(firstNumber>secondNumber) {
			System.out.println("the number"+firstNumber+ "is bigger");
		}else if(firstNumber<secondNumber) {
			System.out.println("the number"+secondNumber+ "is bigger");
		}else if(firstNumber==secondNumber) {
			System.out.println("the numbers "+firstNumber+" and "+secondNumber+ "Are equal");
		}
		System.out.println();
		System.out.println("Enter ur year :");
		double year=scanner.nextDouble();
		if(year%100==0) {
			if(year%400==0) {
				System.out.println("The year "+ year +" is Leap year");
			}else{
				System.out.println("The year "+ year +" is Not-Leap year");
			}
		} if(year%4==0) {
			System.out.println("The year "+ year +" is Leap year");
		}else {
			System.out.println("The year "+ year +" is Not-Leap year");
		}
	// b=true;
		//while(b) {
			System.out.println();
			System.out.println("Enter");
			int num1=scanner.nextInt();
			int num2=scanner.nextInt();
			int num3=scanner.nextInt();
			if(num1<num2 && num1<num3) {
				System.out.println(num1 + " is Small among three");
			}
			else if(num2<num1 && num2<num3) {
				System.out.println(num2 + " is Small among three");
			}
			else {
				System.out.println(num3 + " is Small among three");
			}
		//}
	}
}
