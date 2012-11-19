package com.hitv.pattern.creational.builder;

public class Main {
	public static void main(String args[]) {
		PersonBuilderDirector pbd = new PersonBuilderDirector();
		Person man = pbd.constructPerson(new ManBuilder());
		Person lady = pbd.constructPerson(new LadyBuilder());
		System.out.println(">>>" + man.getHead() + "," + man.getBody() + ","
				+ man.getFoot());
		System.out.println(">>>" + lady.getHead() + "," + lady.getBody() + ","
				+ lady.getFoot());
	}
}
