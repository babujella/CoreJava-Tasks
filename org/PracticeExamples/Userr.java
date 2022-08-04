package com.org.PracticeExamples;

import java.util.Scanner;

public class Userr {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter :");
		float number=scanner.nextFloat();
		float result=(float)number/1000000000;
		System.out.println(result);
		int results=Math.round(result);
		System.out.println(results);
	
	}
}
