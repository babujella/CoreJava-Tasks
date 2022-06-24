package com.org.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class OperationsOnArrayList {
	public static void main(String[] args) {
		ArrayList<Integer>arrayList=new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			arrayList.add(i);
		}
		System.out.println("Iterate using ListIterator....");
		ListIterator<Integer> litr=arrayList.listIterator();
		while(litr.hasNext()) {
			System.out.print(" "+litr.next());
		}
		System.out.println();
		System.out.println("Adding element at specified Index....");
		arrayList.add(3, 49);
		System.out.print(" "+arrayList);
		System.out.println();
		System.out.println("Sort ArrayList in descending order...");
		Collections.sort(arrayList,Collections.reverseOrder());
		System.out.print(" "+arrayList);
		System.out.println();
		System.out.println("insert an element to ArrayList using ListIterator");
		ListIterator littr=arrayList.listIterator();
		while(littr.hasNext()) {
			littr.add(94);
			littr.next();
		}
		System.out.print(" "+arrayList);
		System.out.println();
		ArrayList<String> list=new ArrayList<String>();
		list.add("Babu");
		list.add("Pavan");
		list.add("Pavani");
		System.out.println("insert an element to ArrayList using ListIterator");
		Collections.sort(list);
		System.out.print(" "+list);
		System.out.println();
		System.out.println("insert an element to ArrayList using ListIterator");
		arrayList.set(10, 11);
		System.out.print(" "+arrayList);
		System.out.println();
		System.out.println("Remove element from specified index ArrayList");
		arrayList.remove(2);
		list.remove(2);
		System.out.print(" "+arrayList);
		System.out.println();
		System.out.print(" "+list);
	}
}
