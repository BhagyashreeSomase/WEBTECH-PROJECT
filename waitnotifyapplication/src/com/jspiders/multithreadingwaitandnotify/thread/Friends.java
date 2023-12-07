package com.jspiders.multithreadingwaitandnotify.thread;

import com.jspiders.multithreadingwaitandnotify.resources.Pizza;

public class Friends extends Thread {
	private Pizza pizza;
	public Friends(Pizza pizza) {
		this.pizza=pizza;
	}
	@Override
	public void run() {
		Pizza pizza = new Pizza();
		pizza.orderPizza(5);
	}

}
