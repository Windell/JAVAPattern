package com.hitv.pattern.examples.decorator.coffee;

public class HouseBlend extends Beverage {
	// 另一种饮料,被装饰者
	public HouseBlend() {
		description = "HouseBlend";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
