package com.org.PracticeExamples;

import java.util.Scanner;

public class NumberFoundIn {
	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the size :");
			int size=scanner.nextInt();
			System.out.println("Enter elements :");
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=scanner.nextInt();
			}
			while(true) {
			System.out.println("Enter the number that u want to be search :");
			int number=scanner.nextInt();
			int value=0;
			for(int j=0;j<size;j++) {
				if(arr[j]==number) {
					value=1;
					break;
				}
			}
			if(value==1) {
				System.out.println(number  +  " is founded..");
			}
			else {
				System.out.println(number +" Not founded");
				break;
			}

		}
	}
}
