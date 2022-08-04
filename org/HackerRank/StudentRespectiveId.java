package com.org.HackerRank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StudentRespectiveId {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in); 
		int[] array1 = new int[4]; 
		int[] array2 = new int[4]; 
		int[] array3 = new int[4]; 
		int[][] input = {{1,2,3,4},{2,3,4,5},{1,3,5,7}};
		int[] numbers= {4,5,7,4};
		int[] output = new int[input.length];
		for (int i = 0; i < input.length ; i++) {
			for (int j = 0; j < input.length; j++) {
				try {
					output[j] = output[j] + input[i][j];
				}catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Size is not same");
				}
			}	
		}
		System.out.println(Arrays.toString(output));
		int sum=IntStream.of(numbers).sum();
		System.out.println(sum);
	}
}
