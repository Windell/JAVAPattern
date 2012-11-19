package com.hitv.pattern.examples.strategy.duck;

public class LiteraryDuck extends Duck {
	public LiteraryDuck() {
		super();
		this.duckName = "Literary Duck";
	}

	public void sing() {
		System.out.println("Literary Duck can sing a song...");
	}
	// LiteraryDuck has more action
}
