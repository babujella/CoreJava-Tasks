package com.org.tcs;

import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		College college[] = new College[n];

		for(int i=0; i<college.length; i++)
		{
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			int contactNo= sc.nextInt();
			
			sc.nextLine();
			String address = sc.nextLine();
			int pincode = sc.nextInt();

			college[i] = new College(id, contactNo, pincode, name, address);
		}
		sc.nextLine();
		String searchaddress = sc.nextLine();

		College res1 = findCollegeWithMaximumPincode(college);
		if(res1!=null)
		{
			System.out.println("id-"+res1.getId());

			System.out.println("name-"+res1.getName());
			System.out.println("contactNo-"+res1.getContactNo());
			System.out.println("address-"+res1.getAddress());
			System.out.println("pincode-"+res1.getPincode());
		}
		else
		{
			System.out.println("No College found with mentioned attribute");
		}

		College res2 =searchCollegeByAddress(college,searchaddress);
		if(res2!=null)
		{
			System.out.println("id-"+res2.getId());

			System.out.println("name-"+res2.getName());
			System.out.println("contactNo-"+res2.getContactNo());
			System.out.println("address-"+res2.getAddress());
			System.out.println("pincode-"+res2.getPincode());
		}
		else
		{
			System.out.println("No College found with mentioned attribute.");
		}

	}
	public static College findCollegeWithMaximumPincode(College col[])
	{
		int max=0;
		College result =null;
		for(int i=0; i<col.length; i++){
			if(col[i].getPincode() > max){
				result = col[i];
				max= col[i].getPincode();
			}
		}

		if(result!=null)
			return result;
		else
			return null;
	}

	public static College searchCollegeByAddress(College c[],String address)
	{
		College ans=null;
		for(int i=0;i<c.length;i++)
		{
			if(c[i].getAddress().equalsIgnoreCase(address))
			{
				ans=c[i];

				
			}
		}
		if(ans!=null)
			return ans;
		else
			return null;
	}
}
