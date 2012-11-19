package com.hitv.pattern.examples.observer.weather.jdkobserver;

public class ForecastDisplay extends BasicWeatherDataDisplay {
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Forecast Display update.....");
	}
}
