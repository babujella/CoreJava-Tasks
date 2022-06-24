package com.org.SchoolMedals;

import java.util.HashMap;
import java.util.Scanner;

public class Usermain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Medals md=new Medals();
		System.out.println("Enter no of Students: ");
		md.method(sc.nextInt());
		sc.close();
	}
}
