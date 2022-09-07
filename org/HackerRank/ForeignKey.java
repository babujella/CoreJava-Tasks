package com.org.HackerRank;

import java.util.Scanner;

public class ForeignKey {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string :");
		String word=scanner.next();
		String vowels="aeiouAEIOU";
		int count=0;
		for(int i=0;i<word.length();i++) {
			for(int j=0;j<vowels.length();j++) {
				if(word.charAt(i)==vowels.charAt(j)) {
					count++;
					break;
				}
			}
			System.out.println(word.charAt(i)+" = "+count);
//			if(count==1) {
//				break;
//			}
		}
		
	}

}
