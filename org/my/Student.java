package com.org.my;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	String name;
	int id;
	String address;
	public Student(String name,int id,String address) {
		this.name=name;
		this.id=id;
		this.address=address;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student("Babu",1, "Siddipet");
		Student s2=new Student("pavan",2,"Hydb");
		Student s3=new Student("Pavani",3, "Madhapur");

		ArrayList<Student> arrayList=new ArrayList<Student>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);

		boolean b=false;
		
		while(b) {
		System.out.println("Enter your Id :");
		int studentId=sc.nextInt();
		for(Student student:arrayList) {
			if(student.id==studentId) {
				b=true;
			}
		}
		try {
			if(b) {
				System.out.println("Welcome");
			}
			else {
				throw new Exception("Exception Raised : Invalid Id");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	}

}
