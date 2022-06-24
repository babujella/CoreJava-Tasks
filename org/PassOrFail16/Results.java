package com.org.PassOrFail16;

import java.util.HashMap;
import java.util.Scanner;

public class Results {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Float> results=new HashMap<>();
		System.out.println("Enter no of Students: ");
		int n=sc.nextInt();
		String na=sc.next();
		//float f=sc.nextFloat();
		for (int i=0;i<n;i++) {
			//PassOrFail re=new PassOrFail(na,sc.nextFloat());
			//results.put(re.name,re.marks);
		}
		HashMap<String,String> mainResult=new HashMap<>();
		for (String i: results.keySet()) {
			if (results.get(i)>60) 
				mainResult.put(i, "pass");
			else
				mainResult.put(i, "fail");
		}
		System.out.println(mainResult);
		sc.close();
	}

}