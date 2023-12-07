package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileOutputStream;

public class ByteStreamWrite {
	public static void main(String[]args) {
		File file=new File("ByteStream.txt");
		if(file.exists()) {
			System.out.println("File already exists.");
		} else {
			try {
				file.createNewFile();
				System.out.println("file created.");
				FileOutputStream fileOutputStream=new FileOutputStream(file);
				fileOutputStream.write(20);
				System.out.println("Data written to file");
				fileOutputStream.close();
			} catch (Exception e) {
	System.out.println("File not created");
	e.printStackTrace();
	}
	}
	}
	}
