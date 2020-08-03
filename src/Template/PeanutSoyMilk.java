package Template;

public class PeanutSoyMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("添加花生");
        System.out.println("添加点牛奶");
    }
}
