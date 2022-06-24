package com.org.ExceptionHandling;

import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j;
		i=sc.nextInt();
		j=sc.nextInt();
		int[] arr = new int[5];                                                        
		try {
			arr[5]=i/j;
		}
		catch(ArithmeticException r) {
			r.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("ArrayIndexOutOfBoundsException check the array size");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		for (int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		sc.close();
	}
}
