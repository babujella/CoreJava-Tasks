package com.org.ParkingSlot;

import java.io.IOException;
import java.util.Scanner;

public class ParkingSlots {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		Cars obj=new Cars();
		Bikes obj1=new Bikes();
		ConvertToFile obj2=new ConvertToFile();
		boolean a=true;
		while(a) {
			System.out.println("If you want to continue press 1 else 0 and press 2 for Details");
			int l=sc.nextInt();
			if(l==0) {
				System.out.println("Please side some vehicles are waiting");
			}
			if(l==2) {
				System.out.println(Cars.filledCarsSlots);
				System.out.println(Bikes.filledBikeSlots);
			}
			System.out.println("Checking the type of Veihcle : 1.Cars  2.Bikes");
			int num=sc.nextInt();
			System.out.println("Enter your name :");
			String name=sc.next();
			if(num==1) {
				System.out.println("Go to Basement 1");
				obj.availableSlotsForCars();
				System.out.println("Enter the Slot No :");
				int slotno=sc.nextInt();
				obj.carSlots(slotno,name);
				obj2.saveFile();
			}
			if(num==2) {
				System.out.println("Go to Basement 2");
				obj1.availableSlotsForBikes();
				System.out.println("Enter the Slot No :");
				int slotno=sc.nextInt();
				obj1.bikeSlots(slotno,name);
				obj2.saveFile();
			}
		}

	}
}
