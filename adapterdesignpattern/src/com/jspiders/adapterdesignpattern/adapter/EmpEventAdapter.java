package com.jspiders.adapterdesignpattern.adapter;

import com.jspiders.adapterdesignpattern.interfaces.Events;
import com.jspiders.adapterdesignpattern.object.Employee;

public class EmpEventAdapter extends Employee implements Events {
public void mothersDay() {
	EmpEventAdapter employee1=new EmpEventAdapter();
	employee1.setEmp_id(1);
	employee1.setName("Aishvarya");
	System.out.println("Chief guest of the event is"+ employee1.getName());
}
public void fathersDay() {
	EmpEventAdapter employee2=new EmpEventAdapter();
	employee2.setEmp_id(2);
	employee2.setName("salman");
	System.out.println("chief guest of the event is"+ employee2.getName());
}
public static void main(String[]args) {
	EmpEventAdapter adapter=new EmpEventAdapter();
adapter.mothersDay();
adapter.fathersDay();
}
}
