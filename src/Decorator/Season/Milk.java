package Decorator.Season;

import Decorator.coffee.Drink;

public class Milk extends Season {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(3.0f);
    }
}
