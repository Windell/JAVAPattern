package com.hitv.pattern.examples.observer.weather.jdkobserver;


public class CurrentConditionsDisplay extends BasicWeatherDataDisplay {
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Update CurrentConditionsDisplay.....");
	}
}
