package com.hitv.pattern.examples.singleton;

public class DoubleCheckSingleton {
	private volatile static DoubleCheckSingleton singleton;

	// volatile所修饰的变量在每次引用时强制从内存重读数据

	private static DoubleCheckSingleton getInstance() {
		if (singleton == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (singleton == null) {
					singleton = new DoubleCheckSingleton();
				}
			}
		}
		return singleton;
	}

	private DoubleCheckSingleton() {

	}
	// 双重空检查+加锁,如此只会被synchronized一次.
}
