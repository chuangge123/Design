package Observer.Weather;

public class InternetWeather {
    public static void main(String[] args) {
        CurrentCondition currentCondition;
        WeatherData weatherData;
        currentCondition=new CurrentCondition();
        weatherData=new WeatherData(currentCondition);
        weatherData.setdata(30,150,40);
    }
}
