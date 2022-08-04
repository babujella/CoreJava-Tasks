package com.org.PracticeExamples;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the people :");
		String people=scanner.nextLine();
		char[] apatPeople=people.toCharArray();
		for(int i=0;i<=apatPeople.length;i++) {
			if(i%2!=0) {
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.println("Enter ur String :");
		String sentance=scanner.nextLine().toLowerCase();
		String[] words=sentance.split("");
		for(int i=0;i<words.length;i++) {
			int count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j]="0";
				}
			}
			if(count>1 &&  words[i] != "0") {
				System.out.print(words[i]);
			}
		}
	}
}

