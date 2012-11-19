package com.hitv.pattern.examples.strategy.duck.flyingduck;

public class StupidDuck extends Duck {

	public StupidDuck(){
		super();
		this.duckName="StupidDuck";
	}
	@Override
	public void swim() {
		super.swim();
		System.out.println("I would like do more");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}

}
