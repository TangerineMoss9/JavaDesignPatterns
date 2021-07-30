package mypackage;

public class StatisticsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	public void update(WeatherData wd) {
		this.temperature = wd.getTemp();
		this.humidity = wd.getHumidity();
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature + 
				"F degrees and " + humidity+ "% humidity");
	}
	
}
