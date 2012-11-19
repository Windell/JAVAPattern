package com.hitv.pattern.structural.bridge;

public class Jacket extends Clothing {

	@Override
	public void personDressClothing(Person person) {
		System.out.println(person.getType()+" wears Jacket");
	}

}
