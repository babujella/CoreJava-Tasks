package com.shravani;

import java.util.List;
import java.util.Scanner;

public class BooklibraryMain {
	static Scanner scanner=new Scanner(System.in);
	
	public static BookLibrary getbokkLibrary() {
		BookLibrary BookL=new BookLibrary();
		System.out.println("Enter the Bookname:");
		BookL.setBookname(scanner.next());
		System.out.println("Enter the Book author:");
		BookL.setBookAuthor(scanner.next());
		System.out.println("Enter the cost:");
		BookL.setCost(scanner.nextInt());
		return BookL;
	}
	
	public static void printBooklibrary(BookLibrary booklibrary) {
		System.out.println("Book name is:"+booklibrary.getBookname());
		System.out.println("Author Name:"+booklibrary.getBookAuthor());
		System.out.println("cost :"+booklibrary.getCost());
	}
	
	
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int choose;
		ShravaniMain main=new ShravaniMain();
		do {
			System.out.println("enter 1 for create and 2 for view and 3 for closing Application");
			choose=scanner.nextInt();
			switch(choose) {

			case 1:BookLibrary createbook=getbokkLibrary();
			main.createBooklist(createbook);
			break;

			case 2:List<BookLibrary> viewBook=main.viewAllBooks();
			for(BookLibrary i:viewBook)
				printBooklibrary(i);
			break;
			case 3: break;
			}
		}
		while(choose!=3);
		System.out.println("Thanks for coming byee..");
	}
}
