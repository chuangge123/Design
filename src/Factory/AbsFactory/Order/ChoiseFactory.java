package Factory.AbsFactory.Order;

import Factory.AbsFactory.AbsPizza.AbsPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChoiseFactory
{
    public ChoiseFactory(AbsFactory factory){
        setFactory(factory);
    }
    AbsFactory factory;
    public void setFactory(AbsFactory factory){
        this.factory=factory;
        AbsPizza absPizza = null;
        String pizzaType = "";
        do {
            pizzaType = getPizzaType();
            //由于factory 为接口类，所以factory可以是子类工厂任何一个
            absPizza= factory.creatPizza(pizzaType);
            if(absPizza !=null){
                System.out.println("订单成功");
                absPizza.prepare();
                absPizza.cut();
                absPizza.bake();
                absPizza.box();
            }
            else {
                System.out.println("订单失败");
                break;
            }
        }while (true);

    }

    private String getPizzaType()
    {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入pizza类型");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}