package com.org.tech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter End number :");
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
		Iterator<Integer> itr=arrayList.iterator();
		while(itr.hasNext()) {
			int numbers=itr.next();
			if(numbers % 2!=0) 
				itr.remove();
		}
		System.out.println(arrayList);

		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int j=0;j<=10;j++) {
			list.add(j);
		}System.out.println(list);
		ListIterator<Integer> litr=list.listIterator();
		System.out.println("Forward direction..");
		while(litr.hasNext()) {
			System.out.print(" "+litr.next());
		}
		System.out.println();
		System.out.println("Backward Direction..");
		while(litr.hasPrevious()) {
			System.out.print(" "+litr.previous());
		}
		System.out.println();
		System.out.println("Previous index :"+litr.previousIndex());
		System.out.println("Next index :"+litr.nextIndex());
		litr.add(11);
		System.out.println(litr.next());
	}
}
