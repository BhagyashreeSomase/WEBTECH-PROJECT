package com.jspiders.serializationanddeserialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspiders.serializationanddeserialization.object.User;

public class UserMain {
public static void main(String[]args) {
	File file;
	FileInputStream fileInputStream;
	FileOutputStream fileOutoutStream;
	try {
		file=new File("object.txt");
		if(file.exists()) {
			System.out.println("File already exists");
		} else {
			file.createNewFile();
			System.out.println("File created");
		}
		fileOutoutStream=new FileOutputStream(file);
		fileInputStream=new FileInputStream(file);
		//serialization
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutoutStream);
		User user=new User(1,"Arjun","arjun@gmail.com");
		objectOutputStream.writeObject(user);
		System.out.println("object written to file");
		objectOutputStream.close();
		//deserialization
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		User output=(User) objectInputStream.readObject();
		System.out.println(output);
		objectInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
	}
}
}
