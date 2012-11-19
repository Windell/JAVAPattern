package com.hitv.pattern.examples.strategy.duck;

public abstract class Duck {
	String duckName;

	public void swim() {
		System.out.println("Duck With Name:" + duckName + "  Is Swimming...");
	}

	public void display() {
		System.out.println("I Am A Duck Named " + duckName);
	}
}
