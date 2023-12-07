package com.jspiders.multithreadingwaitandnotify.thread;

import com.jspiders.multithreadingwaitandnotify.resources.Berger;

public class Customers extends Thread {
	private Berger berger;
	public Customers(Berger berger) {
		this.berger=berger;
	}
	@Override
	public void run() {
		Berger berger = new Berger();
		berger.orderBerger(5);
	}	
}
