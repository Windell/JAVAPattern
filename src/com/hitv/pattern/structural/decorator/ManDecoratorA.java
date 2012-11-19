package com.hitv.pattern.structural.decorator;

public class ManDecoratorA extends Decorator {
	public void drink() {
		System.out.println("The Man is drinking..");
	}

	@Override
	public void eat() {
		super.eat();
		drink();
		System.out.println(ManDecoratorA.class.getSimpleName());
	}
}
