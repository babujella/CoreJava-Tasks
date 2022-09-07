package com.org.tech;

import java.util.Scanner;

public class OccuranceOfLetter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Word :");
		String word=scanner.next();
		System.out.println("Enter the character that u want to count :");
		char letter=scanner.next().charAt(0);

		int number=0;
		for(int i=0;i<word.length();i++) {
			char character=word.charAt(i);
			if(character==letter) {
				number++;
			}
		}
		System.out.println(letter+" - "+number);
	}
}
