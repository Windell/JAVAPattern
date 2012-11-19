package com.hitv.pattern.examples.factory.pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String style) {
		// TODO 创建各种Chicago风味的Pizza
		Pizza pizza = null;
		if ("Cheese".equalsIgnoreCase(style)) {
			// pizza = new ChicagoStyleCheesePizza();
		} else if ("Pepper".equalsIgnoreCase(style)) {
			// pizza = new ChicagoStylePepperPizza();
		}
		return pizza;
	}

}
