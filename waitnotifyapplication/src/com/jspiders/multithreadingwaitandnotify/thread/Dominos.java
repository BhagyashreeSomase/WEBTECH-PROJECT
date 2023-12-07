package com.jspiders.multithreadingwaitandnotify.thread;

import com.jspiders.multithreadingwaitandnotify.resources.Pizza;

public class Dominos extends Thread {
	private Pizza pizza;
	public Dominos(Pizza pizza) {
		this.pizza=pizza;
	}
	@Override
	public void run() {
		pizza.makePizza(5);
	}

}
