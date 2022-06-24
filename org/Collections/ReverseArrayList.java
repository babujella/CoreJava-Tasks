package com.org.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList <String> list=new ArrayList<>();
		list.add("Babu");
		list.add("Raju");
		list.add("Naveen");
		list.add("Venky");
		list.add("Anji");
		//using listIterator we can reverse the Arraylist
		System.out.println("with normal order:......."+list);
		ListIterator<String> itr=list.listIterator(list.size());
		while(itr.hasPrevious()) {
			String str=itr.previous();
			System.out.println(str);
		}
	}
}
