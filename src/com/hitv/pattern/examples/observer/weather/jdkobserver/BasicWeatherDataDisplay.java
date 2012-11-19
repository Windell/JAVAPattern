package com.hitv.pattern.examples.observer.weather.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public abstract class BasicWeatherDataDisplay implements Observer {
	public abstract void update(float tempeture, float humidity, float pressure);

	@Override
	public void update(Observable arg0, Object arg1) {
		if (arg0 instanceof WeatherData) {
			WeatherData wd = (WeatherData) arg0;
			this.update(wd.getTemperature(), wd.getHumidity(), wd.getPressure());
		}
	}
}
