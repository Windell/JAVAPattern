package com.hitv.pattern.behavioral.interpreter;

public class TerminationExpression implements Expression {

	@Override
	public void interprete(String str) {
		System.out.println("You printed quit, so it will be terminated");
		System.exit(0);
	}

}
