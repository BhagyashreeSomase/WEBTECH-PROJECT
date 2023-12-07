package com.jspiders.multithreadingwaitandnotify.resources;

public class Pizza {
static int noOfPizza;
	public synchronized void orderPizza(int orderedPizza) {
System.out.println("ordering"+"Pizza not available");
System.out.println("please wait...!!");
try {
	this.wait();
	} catch (InterruptedException e) {
	e.printStackTrace();
}
	
	noOfPizza-=orderedPizza;
	System.out.println("order of"+orderedPizza+"Pizzas successfully");
}
public synchronized void makePizza(int bakendPizza) {
	System.out.println("Making"+bakendPizza+"Pizza");
	noOfPizza+=bakendPizza;
	System.out.println(noOfPizza+"Pizzas available");
	this.notify();
}
}

