package com.hitv.pattern.structural.adapter;

public class Adapter implements Target {
	Adaptee adaptee;
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}

	@Override
	public void adapterMethod() {
		System.out.print("This is Adapter self-owned method");
	}

	@Override
	public void adapteeMethod() {
		adaptee.adapteeMethod();
	}

}
