package com.hitv.pattern.structural.bridge;

public class Lady extends Person {
	public Lady() {
		this.setType("Lady ");
	}

	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressClothing(this);
	}

}
