package com.org.RockPaperScissors;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameOfThrones {
	public enum RSP{
		ROCK("Rock"),PAPER("Paper"),SCISSOR("Scissor");
		private String value;
		private RSP(String value) {
			this.value=value;
		}
		private static String ComputerChoise() {
			Random random=new Random();
			int computerchoiceNumber=random.nextInt(3)+1;
			String computerChoice=RSP.values()[computerchoiceNumber].value;
			System.out.println(computerChoice);
			return computerChoice;
			//return computerchoiceNumber;
		}
		private static boolean UserChoice(String userchoice,String computerchoice) {
			return 
					userchoice.equals(RSP.ROCK.value) && computerchoice.equals(RSP.SCISSOR.value) ||
					(userchoice.equals(RSP.SCISSOR.value) && computerchoice.equals(RSP.PAPER.value)) ||
					(userchoice.equals(RSP.PAPER.value) && computerchoice.equals(RSP.ROCK.value));
		}
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int wins=0;
			int loose=0;
			int tie=0;
			String userchoice = "";
			String computerchoice = "";
			
			while(true) {
				System.out.println("Enter your type :");
				String playerchoice=sc.nextLine().toLowerCase();
				if(playerchoice.equals("quit")) {
					System.out.println("you won : "+ wins+"  you loose : "+loose+ " tied : "+tie);
					System.out.println("Thanks for playing");
					break;
				}
				String rsp=RSP.ComputerChoise();
				boolean rsp1=RSP.UserChoice(userchoice, computerchoice);
				//if(Arrays.stream(RSP.values()))
				if(playerchoice.equals(rsp)) {
					System.out.println("Its a tie..!");
				}
				else if(rsp1(userchoice,computerchoice)) {
					System.out.println("You won !");
					wins++;
				}
				else {
					System.out.println("You loose !");
					loose++;
				}
			}
		}
		private static boolean rsp1(String userchoice, String computerchoice) {
			// TODO Auto-generated method stub
			return false;
		}
}
