package com.hitv.pattern.examples.observer.weather.forthdisplay;

public class StatisticsDisplay implements Observer{
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("Update Statistic Display.....");
	}
}
