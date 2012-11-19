package com.hitv.pattern.creational.singleton;

public class Main {
	public static void main(String args[]) {
		Singleton object1 = Singleton.getInstance();
		Singleton object2 = Singleton.getInstance();
		System.out.println(object1 + "\n" + object2);
		System.out.println("are objects from same singleton equals:"
				+ (object1 == object2));
	}
}
