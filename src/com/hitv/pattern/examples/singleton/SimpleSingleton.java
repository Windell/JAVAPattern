package com.hitv.pattern.examples.singleton;

public class SimpleSingleton {
	private static SimpleSingleton singleton = null;

	private SimpleSingleton() {
		// TODO initial your object
	}

	public static SimpleSingleton getInstance() {
		if (singleton == null) {
			singleton = new SimpleSingleton();
		}
		return singleton;
	}
	// 最简单最典型的单例,在面对多线程并发访问的时候,可能出现两次调用构造函数产生两个实例的情况.
}
