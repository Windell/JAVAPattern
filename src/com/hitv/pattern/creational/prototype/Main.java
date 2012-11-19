package com.hitv.pattern.creational.prototype;

public class Main {
	public static void main(String args[]) throws CloneNotSupportedException {
		Prototype prototype = new ConcreatePrototype("Prototype");
		Prototype clonedPrototype = (Prototype) prototype.clone();
		System.out.println(prototype.getName() + "\n"
				+ clonedPrototype.getName());
		System.out.print(prototype + "\n" + clonedPrototype);
		// Clone is a copy ,it is not said they are the same objects
	}
}
