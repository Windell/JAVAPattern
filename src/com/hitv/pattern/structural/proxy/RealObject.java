package com.hitv.pattern.structural.proxy;

public class RealObject implements InterfaceObject {

	@Override
	public void action() {
		System.out.println("The Real action ");
	}

}
