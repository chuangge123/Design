package strategy.Duck;

import strategy.Behavior.Delicious;
import strategy.Behavior.DuckFly;

public class GreenDuck extends Duck{
    public GreenDuck(){
        duckfly = new DuckFly();

    }
    @Override
    public void display() {
        System.out.println("我是绿塞的");
    }
    public void greenfly(){
        duckfly.fly();
    }


}
