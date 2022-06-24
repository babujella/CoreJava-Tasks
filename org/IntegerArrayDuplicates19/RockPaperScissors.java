package com.org.IntegerArrayDuplicates19;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Player 1: Choose rock,scissors,or paper :");
		String player1=sc.next().toLowerCase();
		System.out.println("Player 2: Choose rock,scissors,or paper :");
		String player2=sc.next().toLowerCase();
		if(player1.equals(player2)) {
			System.out.println("Its a tie");
		}
		else {
			System.out.println("Not a tie...");
		}
	}
}
