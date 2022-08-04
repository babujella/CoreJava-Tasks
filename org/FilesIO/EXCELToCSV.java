package com.org.FilesIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class EXCELToCSV {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader filereader=new FileReader("D:\\Taskno16\\Taskno16.xls");
		PrintWriter printwriter=new PrintWriter("D:\\Taskno17\\Taskno17.CSV");
		Scanner sc=new Scanner(filereader);
		while(sc.hasNext()) {
			printwriter.println(sc.next());
		}
		System.out.println("Success");
		printwriter.close();
	}
}