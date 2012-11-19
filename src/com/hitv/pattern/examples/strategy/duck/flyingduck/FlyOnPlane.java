package com.hitv.pattern.examples.strategy.duck.flyingduck;

public class FlyOnPlane implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying on the plane....");
	}

}
