package observerPattern;
import java.util.*;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer O) {
		observers.add(O);
	}

	public void removeObserver(Observer O) {
		int i = observers.indexOf(O);
		if (i>=0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i=0; i<observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, temperature);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}