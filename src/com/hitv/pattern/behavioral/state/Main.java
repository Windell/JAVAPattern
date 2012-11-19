package com.hitv.pattern.behavioral.state;

public class Main {
	public static void main(String args[]){
		Context ctx1=new Context();
		Weather rain=new RainWeather();
		Weather sunny=new SunnyWeather();
		ctx1.setWeather(rain);
		ctx1.reportWeather();
	
		ctx1.setWeather(sunny);
		ctx1.reportWeather();
	}
}
