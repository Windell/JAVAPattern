package com.hitv.pattern.examples.strategy.duck.flyingduck;

public abstract class Duck {
	String duckName;
	FlyBehavior flyBehavior;

	public void swim() {
		System.out.println("Duck With Name:" + duckName + "  Is Swimming...");
	}

	public void display() {
		System.out.println("I Am A Duck Named " + duckName);
	}
	public void actionBehavior(){
		if(flyBehavior!=null){
			flyBehavior.fly();
		}
	}
}
