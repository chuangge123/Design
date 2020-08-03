package Factory.AbsFactory.Order;

        import Factory.AbsFactory.AbsPizza.AbsPizza;
        import Factory.AbsFactory.AbsPizza.BJCheesePizza;

public class BJFactory implements AbsFactory
{

    @Override
    public AbsPizza creatPizza(String pizzaType) {
        System.out.println("北京工厂启动ing");
        AbsPizza absPizza = null;
        if (pizzaType.equals("cheese")){
            absPizza=new BJCheesePizza();
        }
        else if(pizzaType.equals("pepper")){
            absPizza=new BJCheesePizza();
        }
        return absPizza;

    }
}
