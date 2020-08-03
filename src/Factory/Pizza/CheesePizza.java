package Factory.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备奶酪");
    }
}
