package Factory.Pizza;
//希腊披萨
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备希腊产地原材料");
    }
}
