package strategy.Duck;

import strategy.Behavior.Delicious;
import strategy.Behavior.DuckDelicous;
import strategy.Behavior.DuckFly;
import strategy.Behavior.Fly;

//设计鸭子有不同颜色 、但是有的会飞、 有的肉质好吃、这时写成方法、写成抽象方法 似乎都不是很合适。
//这些会变得属性 那么就抽象成接口+实现。 小鸭子的属性可以细分为一个属性一个包
public abstract class Duck {
    Delicious duckDelicous; //引用接口对象 因为飞的行为会包括 飞的高 飞的低等
    Fly duckfly;
    public Duck(){
    }
    public void Quack(){
        System.out.println("ga~ga");
    }
    public abstract void display();
    public void swim(){
        System.out.println("im swmming");
    }

}
