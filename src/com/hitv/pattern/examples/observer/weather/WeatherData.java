package com.hitv.pattern.examples.observer.weather;

public class WeatherData {
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

	private CurrentConditionsDisplay curreatConditionDisplay;
	private StatisticsDisplay staticticsDisplay;
	private ForecastDisplay forecastDisplay;

	public void messurementsChanges() {
		curreatConditionDisplay.update(temperature, humidity, pressure);
		staticticsDisplay.update(temperature, humidity, pressure);
		forecastDisplay.update(temperature, humidity, pressure);
		//TODO
	}
}
