package com.hitv.pattern.examples.singleton;

public class SynchronizedSingleton {
	private static SynchronizedSingleton singleton = null;

	private SynchronizedSingleton() {
		// do init
	}

	public synchronized static SynchronizedSingleton getInstance() {
		if (singleton == null) {
			singleton = new SynchronizedSingleton();
		}
		return singleton;
	}
	// 可以确保多线程访问依然单实例,但锁的加入同時导致了效率降低
}
