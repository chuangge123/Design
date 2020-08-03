package Observer.Weather_2;

public class BaiDu implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    private void display() {
        System.out.println("百度气温**Today 气温:"+temperature+"*****");
        System.out.println("百度气温**Today 压力:"+pressure+"*****");
        System.out.println("百度气温**Today 湿度:"+humidity+"*****");
    }
}
