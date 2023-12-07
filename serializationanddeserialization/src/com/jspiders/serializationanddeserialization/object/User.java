package com.jspiders.serializationanddeserialization.object;

import java.io.Serializable;

public class User implements Serializable {
	private static final long SerialVersionUID=1L;
	int id;
	String Name;
	String Email;
	public User(int id,String name,String email) {
this.id=id;
this.Name=name;
this.Email=email;
}
	@Override
	public String toString() {
		return"user[id="+id+",name="+Name+",email="+Email+"]";
	}
}