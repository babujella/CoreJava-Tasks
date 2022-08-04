package com.org.PracticeExamples;

public class UserMainCode {
	public static int FindOfProblems(int input1,String[] input2) {
		int count=0,output=0;
		String str;
		char c;
		for(int i=0;i<input1;i++) {
			str=input2[i];
			for(int j=0;j<str.length();j++) {
				c=str.charAt(j);
				if(c=='1') {
					count++;
				}
			}
			if(count>=2) {
				output++;
			}
			count=0;
		}
		return output;
	}
	public static void main(String[] args) {
		
	}
}
