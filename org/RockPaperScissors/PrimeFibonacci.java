package com.org.RockPaperScissors;

import java.util.Scanner;

public class PrimeFibonacci {
	int k;

	public int fibonacci(int n) {
		int a = 0, b = 1, c;
		if (n == 0) {
			return b;
		}
		for (int i = 1; i <= n / 2; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return b;
	}
	public int nextPrime(int n0) {
	    int n = n0 + 1;
	    boolean isPrime = false;
	    while (!isPrime) {
	        isPrime = true;
	        for(int j = 2; j < n;j++) {
	            if (n % j == 0) {
	                isPrime = false;
	                n++;
	                break;
	            }
	        }
	    }
	    return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER:");
		int k = sc.nextInt();
		PrimeFibonacci fib = new PrimeFibonacci();

		int[] arr1 = new int[k + 1];

		for (int n = 1; n <= k; n++) {

			if (n % 2 == 0) {
				arr1[n] = fib.fibonacci(n);
			} else {
				arr1[n] = fib.nextPrime(n);
			}
		}
		for (int element: arr1) {
			System.out.println(element);
		}
	}

}
