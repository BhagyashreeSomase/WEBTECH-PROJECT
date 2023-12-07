package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread5;
import com.jspiders.multithreading.thread.MyThread6;

public class ThreadMain6 {

	public static void main(String[]args) {
		
		MyThread5 myThread=new MyThread5();
		myThread.setName("Thread1");
		myThread.setPriority(3);
		
		MyThread6 myThread6=new MyThread6();
		Thread thread=new Thread (myThread6);
		thread.setName("Thread2");
		thread.setPriority(5);
        myThread.start();
        thread.start();
	}

		
	}

