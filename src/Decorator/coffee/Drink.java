package Decorator.coffee;

public abstract class Drink {
    public String des;  //描述
    private float price = 0.0f;
    public abstract float cost(); //用来计算订单费用，由子类实现

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
