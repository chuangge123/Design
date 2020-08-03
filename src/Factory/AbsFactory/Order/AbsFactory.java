package Factory.AbsFactory.Order;

import Factory.AbsFactory.AbsPizza.AbsPizza;

public interface AbsFactory
{
    public AbsPizza creatPizza(String pizzaType);
}
