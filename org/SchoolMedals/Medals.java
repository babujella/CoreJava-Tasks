package com.org.SchoolMedals;

import java.util.HashMap;
import java.util.Scanner;

public class Medals {
	Scanner sc=new Scanner(System.in);
	HashMap <Integer,Float> marksList=new HashMap<>();
	HashMap <Integer,String> finalResult=new HashMap<>();
	
	public void method(int n) {
		for (int i=0;i<n;i++) {
			System.out.println("Enter registered numbers And marks: ");
			marksList.put(sc.nextInt(), sc.nextFloat());
		}
		for (Integer i:marksList.keySet()) {
			if (marksList.get(i)>=90) {
				finalResult.put(i,"Gold");
			}
			else if (marksList.get(i)>=80 && marksList.get(i)<90) {
				finalResult.put(i,"Silver");
			}
			else if (marksList.get(i)>=70 && marksList.get(i)<80) {
				finalResult.put(i,"Bronze");
			}
			else {
				finalResult.put(i,"Not Eligible");
			}
		}
		System.out.println(finalResult);
		sc.close();
		}
}
