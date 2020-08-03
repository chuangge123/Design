package Observer.Weather;

public class WeatherData {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    CurrentCondition currentCondition;

    public WeatherData (){}
    public WeatherData (CurrentCondition currentCondition){
        this.currentCondition = currentCondition;
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public void setmTemperature(float mTemperature) {
        this.mTemperature = mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public void setmPressure(float mPressure) {
        this.mPressure = mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(float mHumidity) {
        this.mHumidity = mHumidity;
    }

    public void dataChange(){
        currentCondition.update(getmTemperature(),getmPressure(),getmHumidity());
    }

    public void setdata(float mTemperature,float mPressure,float mHumidity){
        this.mTemperature=mTemperature;
        this.mPressure=mPressure;
        this.mHumidity=mHumidity;
        dataChange();
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "mTemperature=" + mTemperature +
                ", mPressure=" + mPressure +
                ", mHumidity=" + mHumidity +
                '}';
    }
}
