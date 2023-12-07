package com.jspiders.multithreadingwaitandnotify.main;

import com.jspiders.multithreadingwaitandnotify.resources.Pizza;
import com.jspiders.multithreadingwaitandnotify.thread.Dominos;
import com.jspiders.multithreadingwaitandnotify.thread.Friends;

public class PizzaMain {
public static void main(String[]args) {
	Pizza pizza=new Pizza();
	Friends friends=new Friends(pizza);
	Dominos dominos=new Dominos(pizza);
	friends.start();
	dominos.start();
}
}
