package com.jspiders.filehandling.info;

import java.io.File;

public class FileInfodemo1 {
public static void main(String[]args) {
	File file=new File("Hello.txt");
	if(file.exists()) {
		System.out.println("File name:"+file.getName());
		System.out.println("AbsolutePath:"+file.getAbsolutePath());
		System.out.println("file length:"+file.length());
		if(file.canRead()) {
			System.out.println("File is readable");
		} else {
			System.out.println("File is not readable");
		}
		if(file.canWrite()) {
			System.out.println("File is writable");
		} else {
			System.out.println("File is not writable");
		}
		if(file.canExecute()) {
			System.out.println("File is exicutable");
		} else {
			System.out.println("File is not exicutable");
		}
	} else {
		System.out.println("File does not exists.");
	}
}
}
