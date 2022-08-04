package com.org.PracticeExamples;

import java.util.Scanner;

public class PasswordValidation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter password :");
		String password=scanner.next();
		char[] passwordArray=password.toCharArray();
		int uppercase=0;
		int lowercase=0;
		int numbers=0;
		int symbols=0;
		for(int i=0;i<=passwordArray.length;i++) {
			if(passwordArray[i]>='A' && passwordArray[i]<='Z') {
				uppercase++;
			}else if(passwordArray[i]>='0' && passwordArray[i]<=9) {
				numbers++;
			}else if(passwordArray[i]>='a' && passwordArray[i]<='z') {
				lowercase++;
			}else {
				symbols++;
			}
		}
		if(passwordArray.length>8 && uppercase>=2 && lowercase>=2 && numbers>=2 && symbols>=2 ) {
			System.out.println(password +" Is valid");
		}
		else {
			System.out.println(password +" is in valid");
		}
	}
}
