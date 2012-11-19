package com.hitv.pattern.behavioral.strategy;

public class Context {
	public Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void doMethod() {
		strategy.method();
	}
}
