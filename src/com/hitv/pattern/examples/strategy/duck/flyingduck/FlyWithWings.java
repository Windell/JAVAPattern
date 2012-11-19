package com.hitv.pattern.examples.strategy.duck.flyingduck;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I am flying with wings...");
	}

}
