package com.jspiders.multithreading.main;
import com.jspiders.multithreading.thread.MyThread5;

public class ThreadMain5 {
public static void main(String[]args) {
		MyThread5 myThread5=new MyThread5();
		myThread5.setName("Thread2");
		myThread5.setPriority(5);
		myThread5.start();		
		
	}
}