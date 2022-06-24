package com.org.MultiThreading;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionsWithManyCatches {

	/*27. Exceptions with many catches and its order of execution.
	examine on specific to general. Make sure to include both compile time and runtime exceptions in it.
	try followed by catch and finally with return in all blocks. Examine output.
	try followed by catch with return in both blocks. Examine output.*/
	public static void main(String[] args) {
		try {
			int a[]=new int[8];    
			a[8]=100/0;    
			FileWriter f=new FileWriter("abc.txt");
			f.write("Hii");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Solved"+e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException  ae) {
			System.out.println("ArrayIndexOutOfBoundsException solved"+ae);
			return;
		}
		catch(IOException a) {
			System.out.println("NullPointerException is handled"+a);
			return;
		}
		catch(Exception n) {
			System.out.println("Nothing to do...");
			return;
		}
		finally {
			System.out.println("Exceptions Are Handled");
		}
	}

}


