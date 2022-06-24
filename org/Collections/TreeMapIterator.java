package com.org.Collections;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapIterator {
	public static void main(String[] args) {
		TreeMap <Integer,String> map=new TreeMap<>();
		map.put(1,"Babu");
		map.put(2,"Raju");
		map.put(3,"Venky");
		map.put(4,"Naveen");
		map.put(5,"Anji");
		map.put(6,"Shahi");
		map.put(7,"Pavan");
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
