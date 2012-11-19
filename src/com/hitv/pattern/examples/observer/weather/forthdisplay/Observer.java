package com.hitv.pattern.examples.observer.weather.forthdisplay;

public interface Observer {
	public void update(float temperature, float humidity, float pressure);
}
