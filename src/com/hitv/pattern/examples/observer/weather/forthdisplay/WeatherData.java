package com.hitv.pattern.examples.observer.weather.forthdisplay;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;

	private List<Observer> observers = new ArrayList<Observer>();

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setMessurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		messurementsChanges();
	}

	private void messurementsChanges() {
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer o) {
		if (!observers.contains(o))
			observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
}
