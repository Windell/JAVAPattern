package com.hitv.pattern.behavioral.state;

public class RainWeather implements Weather {

	@Override
	public void reportWeather() {
		System.out.println("It is raining...");
	}

}
