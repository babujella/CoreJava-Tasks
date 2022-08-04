package com.org.PracticeExamples;

import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence");
		String sentance=sc.next().toLowerCase();
		char[] ch=sentance.toCharArray();
		char[] vowels= {'a','e','i','o','u'};
		int count=0;
		for(int j=0;j<vowels.length;j++) {
		for(int i=0;i<ch.length;i++) {
				if(vowels[j]==ch[i])
					count++;
			}
			System.out.println(vowels[j]+" = "+count);
			count=0;
		}
	}
}
