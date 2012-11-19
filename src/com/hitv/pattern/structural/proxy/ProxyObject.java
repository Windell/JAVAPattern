package com.hitv.pattern.structural.proxy;

public class ProxyObject implements InterfaceObject {
	InterfaceObject iObject;

	public ProxyObject() {
		System.out.println("This is only a proxy");
		iObject = new RealObject();
	}

	@Override
	public void action() {
		
		System.out.println("Begin Proxy...");
		iObject.action();
		System.out.println("Proxt End...");
	}

}
