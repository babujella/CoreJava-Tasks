package com.org.my;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
	private ArrayList<Integer> list;
	
	public List() {
		list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
	}
	public ArrayList<Integer> getList(){
		return list;
	}
}
