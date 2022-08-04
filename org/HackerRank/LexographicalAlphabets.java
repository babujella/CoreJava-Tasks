package com.org.HackerRank;

import java.util.Scanner;

/*String  is "hello" and  is "java".

A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, h is not greater than j and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".*/

public class LexographicalAlphabets {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter first String :");
		String firstString=scanner.next();
		System.out.println("Enter Second String :");
		String secondString=scanner.next();
		
		System.out.println(firstString.length()+secondString.length());
		if(firstString.compareTo(secondString)<0) {
			System.out.println("No");
			firstString=firstString.substring(0, 1).toUpperCase()+firstString.substring(1, firstString.length());
			secondString=secondString.substring(0, 1).toUpperCase()+secondString.substring(1, secondString.length());
			System.out.println(firstString+" "+secondString);
		}
		else if(firstString.compareTo(secondString)==0) {
			System.out.println("No");
			firstString=firstString.substring(0, 1).toUpperCase()+firstString.substring(1, firstString.length());
			secondString=secondString.substring(0, 1).toUpperCase()+secondString.substring(1, secondString.length());
			System.out.println(firstString+" "+secondString);
		}
		else {
			System.out.println("Yes");
			firstString=firstString.substring(0, 1).toUpperCase()+firstString.substring(1, firstString.length());
			secondString=secondString.substring(0, 1).toUpperCase()+secondString.substring(1, secondString.length());
			System.out.println(firstString+" "+secondString);
		}
	}
}
