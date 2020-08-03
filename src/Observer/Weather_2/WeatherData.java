package Observer.Weather_2;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        //遍历通知。
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }
    public void datachange(){
        notifyObserver();
    }
    public void setData(float temperature,float pressure,float humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        datachange();
    }
}
