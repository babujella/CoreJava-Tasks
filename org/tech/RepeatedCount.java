package com.org.tech;

import java.util.Scanner;

public class RepeatedCount {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size :");
		int size=scanner.nextInt();
		System.out.println("Enter Word :");
		String word=scanner.next().toUpperCase();
		char sentance[]=word.toCharArray();
		int red=0;
		int green=0;
		for(int i=0;i<sentance.length;i++) {
			if(sentance[i]=='R') {
				red++;
			}else {
				green++;
			}
		}
		if(red>green) {
			System.out.println(green);
		}else {
			System.out.println(red);
		}
		System.out.println(Math.max(red, green));
	}
}
