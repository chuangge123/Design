package Factory.AbsFactory.AbsPizza;

public class BJPepperPizza extends AbsPizza{
    @Override
    public void prepare() {
        setName("老北京胡椒披萨");
        System.out.println("老北京胡椒披萨，准备胡椒粉ing");
    }
}
