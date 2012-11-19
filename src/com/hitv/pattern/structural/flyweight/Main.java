package com.hitv.pattern.structural.flyweight;
public class Main {
	public static void main(String args[]) {
		FlyWeight fly1 = FlyWeightFactory.getFlyWeight("a");
		fly1.action(1);

		FlyWeight fly2 = FlyWeightFactory.getFlyWeight("a");
		System.out.println(fly1 == fly2);

		FlyWeight fly3 = FlyWeightFactory.getFlyWeight("b");
		fly3.action(2);

		FlyWeight fly4 = FlyWeightFactory.getFlyWeight("c");
		fly4.action(3);

		FlyWeight fly5 = FlyWeightFactory.getFlyWeight("d");
		fly4.action(4);

		System.out.println(FlyWeightFactory.getSize());
	}

}
