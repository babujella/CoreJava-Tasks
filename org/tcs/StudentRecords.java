package com.org.tcs;

import java.util.*;

import com.org.my.List;

public class StudentRecords {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter No of Stdents that u want to save :");
		int numberofSudents=scanner.nextInt();

		HashMap<Integer, ArrayList<String>> hashMap=new HashMap();

		for(int i=0;i<=numberofSudents;i++) {

			ArrayList studentDetails=new ArrayList();

			System.out.println("Enter name of Stuent :");
			String name=scanner.next();
			System.out.println("Enter number of the student :");
			String number=scanner.next();
			System.out.println("Enter place of the student :");
			String place=scanner.next();
			System.out.println("Enter id of the Student :");
			int StudentId=scanner.nextInt();
			studentDetails.add(name);
			studentDetails.add(number);
			studentDetails.add(place);

			hashMap.put(StudentId, studentDetails);
			System.out.println(hashMap);
			System.out.println();
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(true) {
			System.out.println("Enter Id :");
			int SerachId=scanner.nextInt();
			if(hashMap.containsValue(SerachId)) {
				list.add(SerachId);
				System.out.println(list);
			}
			if(hashMap.containsKey(SerachId)) {
				System.out.println(hashMap.get(SerachId));
			}
			else {
				System.out.println("Id not found...");
				break;
			}
		}
	}
}
