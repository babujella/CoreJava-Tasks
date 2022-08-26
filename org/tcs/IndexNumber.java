package com.org.tcs;

import java.util.Scanner;

public class IndexNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur word :");
		String word=scanner.next();
		System.out.println("Enter the element to get index :");
		String letter=scanner.next();
		//char[] art=word.toCharArray();
		if(word.contains(letter)) {
		System.out.println(word.indexOf(letter));
		}else {
			System.out.println("Bye");
		}
		scanner.close();
	}
}

