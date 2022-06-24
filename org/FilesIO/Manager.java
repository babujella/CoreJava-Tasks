package com.org.FilesIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class Manager extends Employee{
	public  void write() throws IOException {
		PrintWriter p=new PrintWriter("D:\\TASKS\\TASKS.txt");           //Writing to the file
		p.println("Name changed Hello Brave");
		System.out.println("Success");
		p.close();
	}
	public void read() throws IOException {
		FileReader filewriter=new FileReader("D:\\TASKS\\TASKS.txt");         //Reader .
		BufferedReader b = new BufferedReader(filewriter);
		int i;
		while((i=b.read())!=-1)
			System.out.print((char)i);
	}


}