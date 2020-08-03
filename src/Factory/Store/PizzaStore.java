package Factory.Store;

import Factory.Order.OrderPizza;
import Factory.Order.SimpleFactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
        System.out.println("---------程序退出---------");
    }
}
