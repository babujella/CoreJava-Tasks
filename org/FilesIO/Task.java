package com.org.FilesIO;

import java.io.File;

public class Task {
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}
	public static void main(String[] args) {
		

		final File folder = new File("C:\\Users\\tech\\IdeaProjects");
		listFilesForFolder(folder);

	}
}
