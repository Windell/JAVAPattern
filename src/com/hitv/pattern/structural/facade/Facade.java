package com.hitv.pattern.structural.facade;

public class Facade {
	ServiceA serviceA;
	ServiceB serviceB;
	ServiceC serviceC;

	public Facade() {
		serviceA = new ServiceAImpl();
		serviceB = new ServiceBImpl();
		serviceC = new ServiceCImpl();
	}

	public void actionA() {
		serviceA.methodA();
		serviceB.methodB();
	}

	public void actionB() {
		serviceA.methodA();
		serviceC.methodC();
	}

	public void actionC() {
		serviceB.methodB();
		serviceC.methodC();
	}
}
