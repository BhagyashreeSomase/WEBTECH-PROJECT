package com.jspiders.multithreadingwaitandnotify.resources;

public class Berger {
	static int noOfBerger;
	public synchronized void orderBerger(int orderedBerger) {
System.out.println("ordering"+"Berger not available");
System.out.println("please wait...!!");
try {
	this.wait();
	} catch (InterruptedException e) {
	e.printStackTrace();
}
	
	noOfBerger-=orderedBerger;
	System.out.println("order of"+orderedBerger+"Bergers successfully");
}
public synchronized void makeBerger(int bakendBerger) {
	System.out.println("Making"+bakendBerger+"Berger");
	noOfBerger+=bakendBerger;
	System.out.println(noOfBerger+"Bergers available");
	this.notify();
}

}



