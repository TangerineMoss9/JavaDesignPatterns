package mypackage;

public class ForcastDisplay implements Observer, DisplayElement{

	private float temperature;
	private Subject weatherData;
	
	public ForcastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void update(WeatherData wd) {
		this.temperature = wd.getTemp();
		display();
	}
	
	public void display() {
		System.out.println("Forecast: Tomorrows temperature will be " + 
				this.temperature + " again.");
	}
	
}
