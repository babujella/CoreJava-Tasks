package com.org.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizeArrayList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList();
		list.add(1);
		list.add(2) ;
		list.add(3);

		list=Collections.synchronizedList(list);  
		synchronized (list) { 
            Iterator<Integer> itr = list.iterator();  
            while (itr.hasNext()) {  
                System.out.println(itr.next());  
            }  
		}
	}
}
