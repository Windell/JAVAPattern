package com.hitv.pattern.examples.decorator.coffee;

public class Soy extends CondimentDecorator {
	// Soy酱油,装饰者
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " ,Soy";
	}

	@Override
	public double cost() {
		return 0.25 + beverage.cost();
	}

}
