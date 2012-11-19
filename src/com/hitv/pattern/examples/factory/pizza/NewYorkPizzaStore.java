package com.hitv.pattern.examples.factory.pizza;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String style) {
		// TODO 创建各种New York风味的Pizza
		Pizza pizza = null;
		if ("Cheese".equalsIgnoreCase(style)) {
			// pizza = new NYStyleCheesePizza();
		} else if ("Pepper".equalsIgnoreCase(style)) {
			// pizza = new NYStylePepperPizza();
		}
		return pizza;
	}

}
