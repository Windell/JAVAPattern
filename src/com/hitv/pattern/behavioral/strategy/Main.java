package com.hitv.pattern.behavioral.strategy;

public class Main {
	public static void main(String args[]) {
		Context ctxA = new Context(new StrategyImplA());
		Context ctxB = new Context(new StrategyImplB());
		Context ctxC = new Context(new StrategyImplC());
		ctxA.doMethod();

		ctxB.doMethod();

		ctxC.doMethod();
	}
}
