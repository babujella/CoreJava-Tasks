package com.org.ExceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	String name;
	int id;
	String address;
	public Employee(String name,int id,String address) {
		this.name=name;
		this.id=id;
		this.address=address;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee s1=new Employee("Babu",1, "Siddipet");
		Employee s2=new Employee("pavan",2,"Hydb");
		Employee s3=new Employee("Pavani",3, "Madhapur");

		ArrayList<Employee> arrayList=new ArrayList<Employee>();
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);

		boolean b=false;

		while(b) {
			System.out.println("Enter your Id :");
			int studentId=sc.nextInt();
			for(Employee student:arrayList) {
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


