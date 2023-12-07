package com.jspiders.multithreadingwaitandnotify.main;

import com.jspiders.multithreadingwaitandnotify.resources.Berger;
import com.jspiders.multithreadingwaitandnotify.thread.Dominos;
import com.jspiders.multithreadingwaitandnotify.thread.Customers;

public class BergerMain {
	public static void main(String[]args) {
		Berger berger=new Berger();
		Customers customers=new Customers(berger);
		Dominos dominos=new Dominos(berger);
		customers.start();
		dominos.start();
}
}