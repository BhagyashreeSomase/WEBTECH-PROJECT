package com.jspiders.filehandling.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamRead {
	public static void main(String[]args) throws IOException {
		File file=new File("ByteStream.txt");
		if(file.exists()) {
			try {
				FileInputStream fileInputStream=new FileInputStream(file);
				System.out.println("Reading data from file.");
				System.out.println("FileInputStream.read()");
				fileInputStream.close();
			} catch (FileNotFoundException e) {
               	e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
	}
	} else {
		System.out.println("File does not exist.");
	}
	}
	}


