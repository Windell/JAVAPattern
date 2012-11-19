package com.hitv.pattern.structural.flyweight;

public class FlyWeightImpl implements FlyWeight {

	@Override
	public void action(int args) {
		System.out.println("The Argument is "+args);
	}

}
