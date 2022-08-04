package com.org.Collections;
import java.util.*;

public class SortingHashmap {
	public static void main(String[] args) {
		String string="tamilnadu||chennai-karanataka||bengaluru";
		HashMap<String, String> hashMap=new HashMap<String, String>();
		String parts[]=string.split("-");
		for(String part : parts) {
			String[] statesData=part.split("||");
			String state=statesData[0].trim();
			String capital=statesData[1].trim();
			hashMap.put(state, capital);
		}
		System.out.println(hashMap);
	}
}
