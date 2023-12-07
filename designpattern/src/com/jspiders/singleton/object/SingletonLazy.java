package com.jspiders.singleton.object;

public class SingletonLazy {
static SingletonLazy object;
private SingletonLazy() {
	System.out.println("Constructor accessed");
}
public static SingletonLazy getobject() {
	System.out.println("Method accessed");
	if(object==null) {
		object=new SingletonLazy();
	}
	return object;
}
}



