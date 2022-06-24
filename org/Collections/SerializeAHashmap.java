package com.org.Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SerializeAHashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "virat");
		map.put(2, "rohit");
		map.put(3, "pant");
		try {
		FileOutputStream fout=new FileOutputStream("f.txt");
	    ObjectOutputStream out = new ObjectOutputStream(fout);
	    out.writeObject(map);
	    out.flush();
	    System.out.println("success");
	    out.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
		    ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		    HashMap s=(HashMap)in.readObject();
		    System.out.println(s);
		    in.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}
}
