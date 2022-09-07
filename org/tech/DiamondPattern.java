package com.org.tech;

import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		DiamondPattern diamondPattern=new DiamondPattern();
		System.out.println("Enter number :");
		int number=scanner.nextInt();
		diamondPattern.myMethod(number);

	}
	public void myMethod(int number) {
		int space=number/2;
		int standsNumber=1;

		for(int i=1;i<=number;i++) {
			for(int j=1;j<=space;j++) 
				System.out.print(" ");
			int count=standsNumber/2+1;
			for(int k=1;k<=standsNumber;k++) {
				System.out.print(count);
				if(k<=standsNumber/2)
					count--;
				else
					count++;
			}
			System.out.println();
			if(i<=number/2) {
				space=space-1;
				standsNumber=standsNumber+2;
			}
			else {
				space=space+1;
				standsNumber=standsNumber-2;
			}
		}
	}
}
