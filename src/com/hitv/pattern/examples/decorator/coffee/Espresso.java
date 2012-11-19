package com.hitv.pattern.examples.decorator.coffee;

public class Espresso extends Beverage {
	// Espresso浓咖啡是一种基础材料,被装饰者.
	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
