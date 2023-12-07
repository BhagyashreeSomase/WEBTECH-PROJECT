package com.jspiders.factorydesignpattern.object;

import com.jspiders.factorydesignpattern.beverage.Beverage;

public class MasalaTea implements Beverage {
	@Override
	public void order() {
		System.out.println("Ordered MasalaTea");
	}

}
