package com.org.FilesIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*Employee has methods for create, read and write to a file.
Manager extends employer and have these file methods overridden(Examine here without handling the exceptions)
 along with delete the file.*/
public class Employee{
	public  void create() throws Exception {
		File f=new File("D:\\TASKS.txt");               //Creating  the file
		System.out.println(f.exists());
		try {
			f.createNewFile();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(f.exists());

		System.out.println("Success");
	}
	public void write() throws IOException {
		PrintWriter p=new PrintWriter("D:\\TASKS\\TASKS.txt");           //Writing to the file
		p.println("Hello Babu how r u");
		System.out.println("Success");
		p.close();
	}
	public void read()throws IOException{
		FileReader filewriter=new FileReader("D:\\TASKS\\TASKS.txt");         //Reader .
		BufferedReader b = new BufferedReader(filewriter);
		int i;
		while((i=b.read())!=-1)
			System.out.print((char)i);
	}

}


