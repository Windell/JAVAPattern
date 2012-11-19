package com.hitv.pattern.structural.decorator;

public class Main {
	public static void main(String args[]) {
		Man man = new Man();
		ManDecoratorA decoratorA = new ManDecoratorA();
		ManDecoratorB decoratorB = new ManDecoratorB();
		decoratorA.setPerson(man);
		decoratorB.setPerson(decoratorA);
		decoratorB.eat();
	}
}
