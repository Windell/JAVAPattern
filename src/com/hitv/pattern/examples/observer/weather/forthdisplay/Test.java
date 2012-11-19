package com.hitv.pattern.examples.observer.weather.forthdisplay;

public class Test {
	public static void main(String args[]) {
		WeatherData weather=new WeatherData();
		
		CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay=new ForecastDisplay();
		StatisticsDisplay statisticsDisplay=new StatisticsDisplay();
		ForecastDisplay forthDisplay=new ForecastDisplay();
		
		weather.registerObserver(currentDisplay);
		weather.registerObserver(forecastDisplay);
		weather.registerObserver(statisticsDisplay);
		weather.registerObserver(forthDisplay);
		weather.setMessurements(1.1f,2.0f,3.3f);
		
		System.out.println("\nRemove some observers....\n");
		weather.removeObserver(forthDisplay);
		weather.removeObserver(currentDisplay);
		weather.setMessurements(1.1f,2.0f,3.3f);
	}
}
