package com.org.tech;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Long> hashMap=new HashMap<String, Long>();

		while(true) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Name :");
			String name=scanner.next();
			System.out.println("Number :");
			long numbers = 0;
			try {
				numbers=scanner.nextLong();
			}catch(Exception e) {
				System.out.println(e +"\n Missmatch..");
			}

			String number=String.valueOf(numbers);
			if(hashMap.containsKey(name)) {
				System.out.println("Duplicate name exsits.. ");
				break;
			}


			else {
				if(number.charAt(0)>='6') {
					long finalNumber=Long.parseLong(number);
					hashMap.put(name, finalNumber);
					System.out.println(hashMap);
					System.out.println();
				}
				else {
					System.out.println("ur phn number is doesn't match to our requirements..");
					System.out.println();
				}
			}

		}
		System.out.println("Final answer");
		System.out.println();
		for (Entry<String, Long> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		System.out.println();
		System.out.println("Enter :");
		String username=sc.nextLine();
		if(hashMap.containsKey(username)) {
			long num=hashMap.get(username);
			System.out.println(num);
		}
		else {
			System.out.println("Not found");
		}
	}

}
