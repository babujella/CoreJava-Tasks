package com.org.HackerRank;

import java.util.Scanner;

/*Given a string, , and two indices, START and END-1, print a substring consisting of all
 *  characters in the inclusive range from START to END. 
 *  
 *  Sampul input :
 *  HelloWorld
 *  3,6
 *  
 *  Sample output :
 *  loW
 *  .*/
public class SubString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter first String :");
		String Word=scanner.next();
		System.out.println("Enter ur starting index :");
		int startingindex=scanner.nextInt();
		System.out.println("Enter ur last index :");
		int endIndex=scanner.nextInt();
		String finalAnswer=Word.substring(startingindex, endIndex);
		System.out.println(finalAnswer);
	}
}
