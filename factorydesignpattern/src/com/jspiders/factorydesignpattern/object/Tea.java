package com.jspiders.factorydesignpattern.object;

import com.jspiders.factorydesignpattern.beverage.Beverage;

public class Tea implements Beverage {
	@Override
public void order() {
	System.out.println("ordered Tea");
}
}
