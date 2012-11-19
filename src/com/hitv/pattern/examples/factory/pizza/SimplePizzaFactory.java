package com.hitv.pattern.examples.factory.pizza;

public class SimplePizzaFactory {
	// 这是一个简单工厂的例子,工厂创造的产品即Pizza.
	public Pizza createPizza(String style) {
		Pizza pizza = null;
		if ("Cheese".equalsIgnoreCase(style)) {
			pizza = new CheesePizza();
		} else if ("Pepper".equalsIgnoreCase(style)) {
			pizza = new PepperPizza();
		}
		return pizza;
	}
}
