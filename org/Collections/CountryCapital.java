package com.org.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountryCapital {
	public static void main(String[] args) {
		HashMap<String,String> data=new HashMap<>();
		data.put("India","Delhi");
		data.put("japan","tokyo");
		data.put("USA", "WashigtonDC");
		System.out.println(".....foreach loop........");
		for (String i:data.keySet()) {
			System.out.println(i+" "+data.get(i));	
		}
		System.out.println(" .......entryset iterator........");
		for (Map.Entry m:data.entrySet()) {
			System.out.println(m.getKey()+"----->"+m.getValue());
		}
		System.out.println("...... using entryset  using java iterator........");
		Iterator itr=data.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
