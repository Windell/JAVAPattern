package com.hitv.pattern.examples.observer.weather.forthdisplay;

public class ForecastDisplay implements Observer{
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Forecast Display update.....");
	}
}
