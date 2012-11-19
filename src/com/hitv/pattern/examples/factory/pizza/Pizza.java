package com.hitv.pattern.examples.factory.pizza;

public abstract class Pizza {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String name;

	public abstract void prepare();

	public abstract void bake();

	public abstract void cut();

	public abstract void box();
}
