package com.hitv.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	private static Map<String, FlyWeight> flyweights = new HashMap<String, FlyWeight>();

	public FlyWeightFactory(String arg) {
		flyweights.put(arg, new FlyWeightImpl());
	}

	public static FlyWeight getFlyWeight(String arg) {
		if (flyweights.get(arg) == null) {
			flyweights.put(arg, new FlyWeightImpl());
		}
		return flyweights.get(arg);
	}

	public static int getSize() {
		return flyweights.size();
	}
}
