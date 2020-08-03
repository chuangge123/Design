package Observer.Weather_2;

public class Client {


    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditions currentConditions=new CurrentConditions();
        BaiDu baiDu=new BaiDu();
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baiDu);
        weatherData.setData(32,100,60);


    }
}
