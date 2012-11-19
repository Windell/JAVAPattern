package com.hitv.pattern.examples.observer.weather.forthdisplay;

public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObserver();
}
