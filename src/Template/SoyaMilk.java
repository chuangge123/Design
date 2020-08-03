package Template;

public abstract class SoyaMilk {
//模板方法final 防止被子类覆盖
    final void make(){
        select();
        if(customerWantCondiments()){
            addCondiments();
        }
        soak();
        beat();
    }
    //选材料
    void select(){
        System.out.println("选好的新鲜黄豆");
    }
    //添加不同的材料
    abstract void addCondiments();
    //浸泡
    void soak(){
        System.out.println("把材料与黄豆浸泡3小时");
    }
    void beat(){
        System.out.println("豆浆机，打磨");
    }
    //钩子方法、、制作原味豆浆。
    boolean customerWantCondiments(){
        return true;
    }
}
