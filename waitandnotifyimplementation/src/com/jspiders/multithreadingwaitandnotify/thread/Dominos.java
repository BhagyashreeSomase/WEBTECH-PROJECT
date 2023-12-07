package com.jspiders.multithreadingwaitandnotify.thread;
import com.jspiders.multithreadingwaitandnotify.resources.Berger;
public class Dominos extends Thread {
	private Berger berger;
	public Dominos(Berger berger) {
		this.berger=berger;
	}
	@Override
	public void run() {
		berger.makeBerger(5);
	}
}
