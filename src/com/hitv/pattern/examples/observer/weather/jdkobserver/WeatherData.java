package com.hitv.pattern.examples.observer.weather.jdkobserver;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	private float pressure;

	private void messurementsChanges() {
		setChanged();
		this.notifyObservers();
	}

	public void setMessurement(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		messurementsChanges();
	}
}
