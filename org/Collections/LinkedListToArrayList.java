package com.org.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList();//this is linkedlist
		list.add("Babu");
		list.add("Raju");
		list.add("venky");
		list.add("Anji");
		list.add("Shahsi");
		System.out.println("this is the linkedlist: "+list);
		//change linkedlist to Arraylist
		ArrayList<String> arrlist=new ArrayList<>(list);
		System.out.println("this is the arraylist: "+arrlist);

	}
}
