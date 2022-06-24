package com.org.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReadOnlyListSetMap {
	public static void main(String args[]) {            
		List<String> contents = new ArrayList<String>();
		contents.add("Example");
		contents.add("Tutorial");
		contents.add("Program");
		contents.add("Tips"); 
		System.err.println("normal List in Java : " + contents);
		contents = Collections.unmodifiableList(contents);
		contents.add("Can I add object into read only List - No");
		contents.remove("Example"); 
		contents.set(0, "Can I override or set object in read-only Set - No");    
		Set<String> readOnlySet = new HashSet<String>(contents);
		System.out.println("original Set in Java : " + readOnlySet);
		readOnlySet.add("Override");
		System.out.println("Set before making read only : " + readOnlySet);
		readOnlySet = Collections.unmodifiableSet(readOnlySet);
		readOnlySet.add("You can not add element in read Only Set");
		readOnlySet.remove("Example"); 
		Map<String, String> contries = new HashMap<String, String>();      
		contries.put("India", "New Delhi");
		contries.put("UK", "London");
		System.out.println("Map in Java before making read only: " + contries);          
		Map readOnlyMap = Collections.unmodifiableMap(contries);              
		readOnlyMap.put("USA", "Washington");                
		readOnlyMap.remove("UK");     
	}

}

