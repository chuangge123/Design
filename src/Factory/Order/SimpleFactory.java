package Factory.Order;

import Factory.Pizza.CheesePizza;
import Factory.Pizza.GreekPizza;
import Factory.Pizza.PepperPizza;
import Factory.Pizza.Pizza;

public class SimpleFactory
{
    public Pizza createPizza(String PizzaType){
        System.out.println("简单工厂造出");
        Pizza pizza =null;
        System.out.println("正在启动工厂");
        if(PizzaType.equals("greek"))
        {
            pizza = new GreekPizza();
            pizza.setName("greekpizza");
        }
        else if(PizzaType.equals("cheese"))
        {
            pizza = new CheesePizza();
            pizza.setName("cheesepizza");
        }
        else if(PizzaType.equals("pepper"))
        {
            pizza = new PepperPizza();
            pizza.setName("pepperpizza");
        }
        return pizza;
    }
}
