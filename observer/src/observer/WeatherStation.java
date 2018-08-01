package observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(89, 65, 30.5f);
		weatherData.setMeasurements(70, 90, 29.2f);
		weatherData.setMeasurements(110, 190, 129.2f);

	}

}
