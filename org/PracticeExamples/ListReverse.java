package com.org.PracticeExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		System.out.println("Enter the elements :");
	//	Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205}; 
		Integer[] array=new Integer[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array,Collections.reverseOrder() );
		System.out.println(Arrays.toString(array));
		
	}
}
