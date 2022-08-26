package com.org.tcs;

import java.util.Scanner;

public class Vehicle {
	int RegNo;
	String brand;
	long price;
	int mileage;
	
	public Vehicle(int regNo, String brand, long price, int milage) {
		super();
		RegNo = regNo;
		this.brand = brand;
		this.price = price;
		this.mileage = milage;
	}
	
	public void displayVehicledetails() {
		System.out.println("Vehicle [RegNo=" + RegNo + ", brand=" + brand + ", price=" + price + ", mileage=" + mileage +"km/L"+ "]");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
			System.out.println("For first Vehicle :");
			System.out.println("Enter regNo :");
			int regNo1=scanner.nextInt();
			System.out.println("Enter brand :");
			String brand1=scanner.next();
			System.out.println("Enter price :");
			long price1=scanner.nextLong();
			System.out.println("Enter mileage :");
			int mileage1=scanner.nextInt();
			System.out.println("For second Vehicle :");
			System.out.println("Enter regNo :");
			int regNo2=scanner.nextInt();
			System.out.println("Enter brand :");
			String brand2=scanner.next();
			System.out.println("Enter price :");
			long price2=scanner.nextLong();
			System.out.println("Enter mileage :");
			int mileage2=scanner.nextInt();
		Vehicle vehicle1=new Vehicle(regNo1, brand1, price1, mileage1);
		Vehicle vehicle2=new Vehicle(regNo2,brand2, price2, mileage2);
		vehicle1.displayVehicledetails();
		vehicle2.displayVehicledetails();
		System.out.println("prices of Vehicles:");
		System.out.println(vehicle1.brand+" : "+vehicle1.price);
		System.out.println(vehicle2.brand+" : "+vehicle2.price);
		System.out.println();
		if(vehicle1.price <vehicle2.price) {
			System.out.println(vehicle1.brand +" having regnumber "+ vehicle1.RegNo+ " have lowest price.. That is  "+vehicle1.price);
		}
		else {
			System.out.println(vehicle2.brand +" having regnumber "+ vehicle2.RegNo+ " have lowest price.. That is  "+vehicle2.price);
		}
		System.out.println();
		if(vehicle1.mileage>vehicle2.mileage) {
			System.out.println(vehicle1.brand +" having regnumber "+ vehicle1.RegNo+ " having best mileage.. That is  "+vehicle1.mileage);
		}
		else {
			System.out.println(vehicle2.brand +" having regnumber "+ vehicle2.RegNo+ " having best mileage.. That is  "+vehicle2.mileage+"km/L");
		}
	}
}
