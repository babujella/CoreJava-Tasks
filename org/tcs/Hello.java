package com.org.tcs;

public class Hello {
	public static void main(String[] args) {
		String str = "fghijabcde";
		int k = 1;

		for (int i = 0; i <= str.length() - k; i++) {
			System.out.println(str.substring(i,i+k));
		}
	}

}
