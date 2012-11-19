package com.hitv.pattern.creational.singleton;

public class Singleton {
	private static Singleton instance;

	// synchronized可以防止多线程并发的情况创建两个实例
	public synchronized static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
