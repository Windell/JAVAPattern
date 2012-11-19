package com.hitv.pattern.examples.observer.weather.forthdisplay;

public class ForthDisplay implements Observer {

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Forth Display received message");
	}

}
