package com.hitv.pattern.examples.decorator.coffee;

public class Mocha extends CondimentDecorator {
	// 摩卡是一个装饰者,可以使用任何Beverage子类对象添加摩卡,即使用摩卡装饰
	// 被摩卡装饰的饮料,其描述需要加上摩卡,其价值=材料的价值+摩卡的价值
	// 由于Mocha本身也是Beverage子类,因此也可以作为参数被构造Mocha对象,也就成了双倍摩卡的饮料
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " ,Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
