package com.shravani;

import java.util.ArrayList;
import java.util.List;

public class ShravaniMain {
	List<BookLibrary> list=new ArrayList<BookLibrary>();
	public void createBooklist(BookLibrary booklibrary) {
		list.add(booklibrary);
	}
	public List<BookLibrary> viewAllBooks(){
		return list;
	}
}
