package Factory.Order;

import Factory.Pizza.CheesePizza;
import Factory.Pizza.GreekPizza;
import Factory.Pizza.PepperPizza;
import Factory.Pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza
{
    Pizza pizza =null;
    String PizzaType;//说明订购Pizza类型
    //检测订购类型
//    public OrderPizza()
//    {
//        do {
//            PizzaType=getPizzaType();
//            if(PizzaType.equals("greek"))
//            {
//                pizza = new GreekPizza();
//                pizza.setName("greekpizza");
//            }
//            else if(PizzaType.equals("cheese"))
//            {
//                pizza = new CheesePizza();
//                pizza.setName("cheesepizza");
//            }
//            else if(PizzaType.equals("pepper"))
//            {
//                pizza = new PepperPizza();
//                pizza.setName("pepperpizza");
//            }
//            else {
//                break;
//            }
//            System.out.println("已接单");
//            pizza.prepare();
//            pizza.cut();
//            pizza.bake();
//            pizza.box();
//        } while(true);
//    }
    //引用简单工厂对象
    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    //获取工厂的创造的对象
    public void setFactory(SimpleFactory simpleFactory){
        this.simpleFactory=simpleFactory;
        do {
            PizzaType = getPizzaType();
            pizza=this.simpleFactory.createPizza(PizzaType);
            if(pizza !=null){
                System.out.println("订单成功");
                pizza.prepare();
                pizza.cut();
                pizza.bake();
                pizza.box();
            }
            else {
                System.out.println("订单失败");
                break;
            }
        }while (true);
    }

    //模拟客户端选择pizza
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
