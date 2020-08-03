package Factory.AbsFactory.Order;

import Factory.AbsFactory.AbsPizza.AbsPizza;
import Factory.AbsFactory.AbsPizza.TJCheesesPizza;
import Factory.AbsFactory.AbsPizza.TJPepperPizza;

public class TJFactory implements AbsFactory
{

    @Override
    public AbsPizza creatPizza(String pizzaType) {
        AbsPizza absPizza = null;
        System.out.println("天津工厂启动ing");
        if (pizzaType.equals("cheese")){
            absPizza = new TJCheesesPizza();
        }
        else if(pizzaType.equals("pepper")){
            absPizza = new TJPepperPizza();
        }
        return absPizza;
    }
}
