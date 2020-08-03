package Factory.Pizza;

public class PepperPizza extends Pizza
{

    @Override
    public void prepare() {
        System.out.println("准备胡椒粉等材料");
    }
}
