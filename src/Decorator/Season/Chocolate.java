package Decorator.Season;

import Decorator.coffee.Drink;

public class Chocolate extends Season {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(5.0f);
    }
}
