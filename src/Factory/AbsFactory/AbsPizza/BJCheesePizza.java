package Factory.AbsFactory.AbsPizza;

public class BJCheesePizza extends AbsPizza{
    @Override
    public void prepare() {
        setName("老北京奶酪披萨");
        System.out.println("北京的奶酪披萨，准备奶酪ing");
    }
}
