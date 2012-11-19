package com.hitv.pattern.examples.observer.weather.jdkobserver;


public class Test {
	public static void main(String args[]) {
		WeatherData weather=new WeatherData();
		
		CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay=new ForecastDisplay();
		StatisticsDisplay statisticsDisplay=new StatisticsDisplay();
		ForecastDisplay forthDisplay=new ForecastDisplay();

		weather.addObserver(currentDisplay);
		weather.addObserver(forecastDisplay);
		weather.addObserver(statisticsDisplay);
		weather.addObserver(forthDisplay);
		weather.setMessurement(1.1f,2.0f,3.3f);
		
		System.out.println("\nRemove some observers....\n");
		weather.deleteObserver(forthDisplay);
		weather.deleteObserver(currentDisplay);
		weather.setMessurement(1.1f,2.0f,3.3f);
	}
}
