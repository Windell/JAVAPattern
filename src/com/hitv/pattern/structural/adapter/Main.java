package com.hitv.pattern.structural.adapter;

public class Main {
	public static void main(String args[]) {
		Adapter adapter = new Adapter(new Adaptee());
		adapter.adapteeMethod();
		adapter.adapterMethod();
	}
}
