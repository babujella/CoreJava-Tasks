package com.org.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class GettingComputerChoice {
	public static String getcomputerChoice(Random random) {
		//Random random=new Random();
		//Computer Taking Random input......
		int ComputerChoiceWord=random.nextInt(3)+1;
		String ComputerChoice="";
		if(ComputerChoiceWord==1) {
			ComputerChoice="Rock";
		}else if(ComputerChoiceWord==2) {
			ComputerChoice="Paper";
		}else if(ComputerChoiceWord==3) {
			ComputerChoice="Scissor";
		}
		//		System.out.println(ComputerChoice);
		System.out.println("Computer made its Decision its ur turn....");
		return ComputerChoice;
	}
	//User taking input.....
	public static String getuserChoice(Scanner scanner) {
		System.out.println("Enter your Choice.");
		String options=scanner.nextLine();
		//System.out.println(options);
		return options;
	}
	//Game follows.....
	public static String winnersChoice(String computerChoice,String userChoice) {
		String finalmsg="";
		int wins=0;
		int loose=0;
		int tie=0;
		if(computerChoice.equals("Rock") && userChoice.equals("Paper")) {
			System.out.println("User wins !");
			return "win";
		}
		else if(computerChoice.equals("Paper") && userChoice.equals("Rock")) {
			System.out.println("Computer wins !");
			return "loose";
		}
		else if(computerChoice.equals("Scissor") && userChoice.equals("Rock")) {
			System.out.println("User wins !");
			return "win";
		}
		else if(computerChoice.equals("Rock") && userChoice.equals("Scissor")) {
			System.out.println("Computer wins !");
			return "loose";
			
		}
		else if(computerChoice.equals("Paper") && userChoice.equals("Scissor")) {
			System.out.println("User wins !");
			return "win";
		}
		else if(computerChoice.equals("Scissor") && userChoice.equals("Paper")) {
			System.out.println("Computer wins !");
			return "loose";
		}
		else if(computerChoice.equals("Scissor") && userChoice.equals("Scissor")) {
			System.out.println("Its a tie !");
			return "tie";
		}
		else if(computerChoice.equals("Paper") && userChoice.equals("Paper")) {
			System.out.println("Its a tie !");
			return "tie";
		}
		else if(computerChoice.equals("Rock") && userChoice.equals("Rock")) {
			System.out.println("Its a tie !");
			return "tie";
		}

		return finalmsg;
	}
	public static void main(String[] args) {
		int wins=0;
		int tie=0;
		int loose=0;
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		String computerChoice;
		String userChoice;
		String winners;
		while(true) {
			computerChoice=getcomputerChoice(random);
			System.out.println("Enter your Choice : 'Rock' , 'Paper','Scissor' or press Quit and show ur results ....");
			userChoice=getuserChoice(scanner);
			String result=winnersChoice(computerChoice, userChoice);
			System.out.println( "\nYou choose : " + userChoice + "\nComputer choose : " +computerChoice );
			System.out.println("-----------------------");
			if(result.equals("win")) {
				wins++;
			}else if(result.equals("loose")) {
				loose++;
			}
			else if(result.equals("tie")) {
				tie++;
			}
			if(userChoice.equals("Quit")) {
				System.out.println(" Thanks for playing");
				System.out.println("You won :"+wins+"  You lost :"+ loose+"  and tie :"+tie);
				break;
			}
		}

	}

}
