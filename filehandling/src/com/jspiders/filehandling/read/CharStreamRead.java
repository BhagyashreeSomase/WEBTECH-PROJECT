package com.jspiders.filehandling.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead {
	public static void main(String[]args) throws IOException {
		File file=new File("CharStream.txt");
		if(file.exists()) {
			try {
				FileReader fileReader=new FileReader(file);
				System.out.println("Reading data from file");
				System.out.println("Read() output:"+"FileReader.Read()");
				Scanner scanner=new Scanner(file);
				System.out.println("Scanner output:");
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
				fileReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("File does not exist");
		}
	}
	
}
