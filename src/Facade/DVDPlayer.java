package Facade;
//外观模式
public class DVDPlayer {
    //定一个单例模式
    private static DVDPlayer instance = new DVDPlayer();
    private DVDPlayer(){}
    public static DVDPlayer getInstance(){
        return instance;
    }
    public void on(){
        System.out.println("DVD开机");

    }
    public void close(){
        System.out.println("DVD关机");
    }
    public void play(){
        System.out.println("DVD放片");
    }
}
//其余的爆米花机，等等，形式也是如此。

//然后在测试类中，我们把各个类的成员引入，获取单例对象。将各个机器开机 设为统一的一种方法。