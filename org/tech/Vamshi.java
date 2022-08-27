package com.org.tech;

import java.util.Scanner;

public class Vamshi {
	 public static void main(String args[]){
	        Scanner in=new Scanner(System.in);
	        System.out.println("Enter :");
	        int t=Integer.parseInt(in.nextLine());
	       int t1=factors(t);
	       System.out.println(t1);
	    }
	    public static int factors(int number){
	        int count;
	        int result=1;
	        for (int i = 2; i<=(number); i++){
	            count=0;
	            while (number % i == 0) {
	                number /= i;
	                count++;
	            }
	            if(count == 0)
	                continue;
	            result*=(count+1);
	        }
	        return result;
	    }
}
