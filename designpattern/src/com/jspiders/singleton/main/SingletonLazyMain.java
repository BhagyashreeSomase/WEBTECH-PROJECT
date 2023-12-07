package com.jspiders.singleton.main;

import com.jspiders.singleton.object.SingletonLazy;

public class SingletonLazyMain {
public static void main(String[]args) {
	SingletonLazy object1=SingletonLazy.getobject();
	SingletonLazy object2=SingletonLazy.getobject();
	SingletonLazy object3=SingletonLazy.getobject();
	System.out.println("obj1");
	System.out.println("obj2");
	System.out.println("obj3");
}
}