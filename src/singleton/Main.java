package singleton;

public class Main {
/*    //Mgr01
    public static void main(String[] args) {
       Mgr01 mgr01 = Mgr01.getInstance();
       mgr01.say();
       Mgr01 mgr011 = Mgr01.getInstance();
       mgr011.say();
    }*/
/*//Mgr02  枚举单例  目前最简便与完美、而且可以防止反射 因为是枚举类。
public static void main(String[] args) {
    for(int i=0;i<100;i++){
        new Thread(()->{
            System.out.println(Mgr02.Instance.hashCode());
        }).start();
    }
}*/
//第三种是因为JVM会保护措施防止了线程出现错误
/*    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }*/
}
