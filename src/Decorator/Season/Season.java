package Decorator.Season;

import Decorator.coffee.Drink;

public class Season extends Drink {
    Drink drink; //为被装饰的coffee类
    public Season (Drink drink){
        this.drink=drink;
    }
    @Override
    public float cost() {
        //获取小料的价格+coffee的cost
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDes(){

        return drink.getDes()+" 加 "+super.getDes()+"共计消费"+this.cost();
    }
}
//drink 为装饰者信息吗？

