package Decorator;

import Decorator.Season.Chocolate;
import Decorator.Season.Milk;
import Decorator.coffee.Drink;
import Decorator.coffee.LongBlack;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink longblack=new LongBlack();
        longblack=new Milk(longblack);
        longblack=new Chocolate(longblack);

        System.out.println(longblack.getDes());
    }
}
