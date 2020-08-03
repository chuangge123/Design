package Decorator.Season;

import Decorator.coffee.Drink;

public class Soy extends Season {
    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(2.5f);
    }
}
