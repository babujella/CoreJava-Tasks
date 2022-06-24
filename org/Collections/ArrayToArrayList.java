package com.org.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("Babu");
		arrlist.add("Raju");
		arrlist.add("Venky");
		arrlist.add("sai");
		arrlist.add("Anji");
		arrlist.add("Naveen");
		System.out.println("arrayList to Array.............");
	     Object[] arr = arrlist.toArray();
	     for (Object i:arr) {
	    	 System.out.println(i);
	     }
	     String[] arr1= {"Babu","Raju","Naveen","sai"};
	     List al = Arrays.asList(arr1);	 
	     System.out.println("array to arrayList..............");
	     System.out.println(al);

	}
}
