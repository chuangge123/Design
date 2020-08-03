package Factory.AbsFactory.Order;

public class PizzaStore {
    public static void main(String[] args) {
        new ChoiseFactory(new BJFactory());
    }
}
