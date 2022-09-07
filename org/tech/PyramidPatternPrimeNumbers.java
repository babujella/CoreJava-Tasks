package com.org.tech;

import java.util.Scanner;

public class PyramidPatternPrimeNumbers {
	public static boolean myMethod(int num) {
		int numbe=1,isprime=1;
		for(int number=2;number<=(num/2);number++) {
			if(num%number==0) {
				isprime=0;
				break;
			}
		}
		if((isprime==1) || num==2){
			System.out.println(num);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number :");
		int number=scanner.nextInt();
		int number2=2;	
		
		for(int i=1;i<=number;++i,number2=0) {
			for(int j=1;j<=number-i;++j) {
				System.out.print(" ");
			}
			while(myMethod(number2)) {
				System.out.print(number);
				++number2;
			}
			System.out.println();
		}
	}

}
