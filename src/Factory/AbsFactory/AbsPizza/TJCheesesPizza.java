package Factory.AbsFactory.AbsPizza;

public class TJCheesesPizza extends AbsPizza {
    @Override
    public void prepare() {
        setName("天津奶酪披萨");
        System.out.println("正在准备奶酪");
    }
}
