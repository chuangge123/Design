package singleton;

public class Mgr01 {
    private static final Mgr01 Instance = new Mgr01();
    //私有化构造方法。
    private Mgr01(){

    }
    //别人怎么用
    public static Mgr01 getInstance(){

        return Instance;
    }

    public void say(){
        System.out.println("I say I love you");
    }

}
