package Observer.Weather;

public class CurrentCondition {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;


    public void update(float mTemperature,float mPressure,float mHumidity){
        this.mTemperature=mTemperature;
        this.mPressure=mPressure;
        this.mHumidity=mHumidity;
        display();
    }

    public void display(){
        System.out.println("========today======="+mHumidity);
        System.out.println("========today=========="+mPressure);
        System.out.println("==========today=========="+mTemperature);
    }

}
