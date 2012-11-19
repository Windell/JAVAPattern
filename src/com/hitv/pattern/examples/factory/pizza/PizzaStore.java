package com.hitv.pattern.examples.factory.pizza;

public abstract class PizzaStore {
	public Pizza orderPizza(String style) {
		// 多种风味的Pizza是变化的部分,封装变化
		Pizza pizza = createPizza(style);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	// 具体Pizza的创建由子类决定.
	// abstract Product factoryMethod()抽象工厂方法.将超类中的代码和具体创建产品的代码分离开.
	public abstract Pizza createPizza(String style);
}
