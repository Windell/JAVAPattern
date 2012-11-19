package com.hitv.pattern.examples.singleton;

public class EagerlySingleton {
	private static EagerlySingleton singleton = new EagerlySingleton();

	private EagerlySingleton() {
		// do init
	}

	public static EagerlySingleton getInstance() {
		return singleton;
	}
	// Eagerly急切式的单例模式,在类加载时即已创建单例,避免多线程失效同事避免同步降低效率
}
