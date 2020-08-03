package Factory.AbsFactory.AbsPizza;

public class TJPepperPizza extends AbsPizza{
    @Override
    public void prepare() {
        setName("天津胡椒披萨");
        System.out.println("正在准备胡椒");
    }
}
