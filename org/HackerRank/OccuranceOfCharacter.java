package com.org.HackerRank;

import java.util.Scanner;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur string :");
		String word=scanner.next();
		char[] words=word.toCharArray();
		int count=1;
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				if(words[i]==words[j]) {
					count++;
				}
			}
			System.out.println(words[i]+" = "+count);
		}
	}
}
