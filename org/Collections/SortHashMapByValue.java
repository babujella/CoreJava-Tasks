package com.org.Collections;

import java.util.*;
import java.util.Map.Entry;

public class SortHashMapByValue {

	public static HashMap<String,Integer> sortingByValues(HashMap<String,Integer> hashMap){

		List<Entry<String,Integer>> list=new LinkedList<>(hashMap.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		LinkedHashMap<String,Integer> linkedhashmap=new LinkedHashMap<String, Integer>();
		for(Map.Entry<String,Integer> obj:list) {
			linkedhashmap.put(obj.getKey(), obj.getValue());
		}
		return linkedhashmap;
	}
	public static void main(String[] args) {
		HashMap<String,Integer> hashmap=new HashMap<>();
		//ArrayList<Integer> list=new ArrayList();
		hashmap.put("Babu", 4);
		hashmap.put("Pavan", 2);
		hashmap.put("Lakshman", 3);
		System.out.println(hashmap);

		HashMap<String,Integer> map=sortingByValues(hashmap);

		for(Map.Entry<String,Integer> sortedValues: map.entrySet()) {
			System.out.println(sortedValues.getKey()+ " : "+ sortedValues.getValue());
		}
	}
}
