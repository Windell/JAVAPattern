package com.hitv.pattern.examples.strategy.duck.flyingduck;

public class FlyingDuck extends Duck {
	public FlyingDuck() {
		this.duckName = "FlyingDuck";
		this.flyBehavior = new FlyWithWings();
	}

	//or
	
	public FlyingDuck(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
