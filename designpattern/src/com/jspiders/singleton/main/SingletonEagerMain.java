package com.jspiders.singleton.main;

import com.jspiders.singleton.object.SingletonEager;

public class SingletonEagerMain {
	public static void main(String[]args) {
		SingletonEager object1=SingletonEager.getobject();
		SingletonEager object2=SingletonEager.getobject();
		SingletonEager object3=SingletonEager.getobject();
		System.out.println("obj1");
		System.out.println("obj2");
		System.out.println("obj3");
	}
	}
