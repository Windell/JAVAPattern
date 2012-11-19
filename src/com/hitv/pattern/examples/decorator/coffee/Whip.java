package com.hitv.pattern.examples.decorator.coffee;

public class Whip extends CondimentDecorator {

	// Whip奶泡,装饰者.
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " ,Whip";
	}

	@Override
	public double cost() {
		return 0.5 + beverage.cost();
	}

}
