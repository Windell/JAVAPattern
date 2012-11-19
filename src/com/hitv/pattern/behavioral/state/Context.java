package com.hitv.pattern.behavioral.state;

public class Context {
	private Weather weather;

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public void reportWeather() {
		weather.reportWeather();
	}
}
