package com.hitv.pattern.structural.decorator;

public class ManDecoratorB extends Decorator {

	@Override
	public void eat() {
		super.eat();
		System.out.println("===============");
		System.out.println(ManDecoratorB.class.getSimpleName());
	}

}
