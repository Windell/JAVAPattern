package com.hitv.pattern.behavioral.interpreter;

public class NonTerminationExpression implements Expression {

	@Override
	public void interprete(String str) {
		System.out.println("Non-termination-interpreter,you printed " + str);
	}

}
