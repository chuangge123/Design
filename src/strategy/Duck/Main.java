package strategy.Duck;

public class Main
{
    public static void main(String[] args) {
        GreenDuck duck = new GreenDuck();
        RedDuck duck1 = new RedDuck();

        duck.display();
        duck.Quack();
        duck.swim();
        duck.greenfly();

        duck1.display();
        duck1.Quack();
        duck1.swim();


    }
}
