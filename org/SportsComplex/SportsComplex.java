package com.org.SportsComplex;

import java.io.IOException;
import java.util.Scanner;

public class SportsComplex {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		BoxCricket obj=new BoxCricket();
		FootBall obj1=new FootBall();
		Badminton obj2=new Badminton();
	//	ConvertToEXCEL obj3=new ConvertToEXCEL();
		while(b) {		
			System.out.println("Want to continue press 0 otherwise press 1 and press 2 for show booking details :: ");
			int l=sc.nextInt();
			if (l==1) {
				System.out.println("see you soon.......");
				return;
			}
			else if(l==2){
				System.out.println("BookedSlots Details :");
				System.out.println("Badminton bookedslots details :"+Badminton.BadmintonfilledSlots);
				System.out.println("FootBall bookedslots details :"+FootBall.footBallsfilledSlots);
				System.out.println("BoxCricket bookedslots details :"+BoxCricket.boxCricketfilledSlots);
			}
			System.out.println("Enter your name");
			String name=sc.next();
			System.out.println("Total List of Available sports : 1.Badminton court"
					+ "2.Football court"
					+ "3.Box Cricket");
			System.out.println("Enter ur sports(number) :");
			int num=sc.nextInt();
			if(num==3) {
				System.out.println("You selected 'Box Cricket'");
				obj.availableSlotsForCricket();
				System.out.println("Enter your slot number :");
				obj.boxCricketSlots(sc.nextInt(),name);
			//	obj3.saveData2();
			}
			if(num==2) {
				System.out.println("You selected 'FootBall sport'");
				obj1.availableslotsForFootBall();
				System.out.println("Enter your slot number :");
				obj1.footBallSlots(sc.nextInt(),name);
			//	obj3.saveData1();
			}
			if(num==1) {
				System.out.println("You selected 'Badminton sport'");
				obj2.availableslotsForBadminton();
				System.out.println("Enter your slot number :");
				obj2.badmintonSlots(sc.nextInt(),name);
				//obj3.saveData();
			}
			if((num)!=1&&(num)!=2&&(num)!=3) {
				System.out.println("You enterd incorrect option");
				continue;
			}
		}
	}
}
