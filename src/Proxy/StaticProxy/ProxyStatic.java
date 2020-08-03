package Proxy.StaticProxy;
   // 狂神婚庆公司案例。
public class ProxyStatic {
//    public static void main(String[] args) {
//        Wedding_Company wedding_Company = new Wedding_Company(new Bridegroom());
//        wedding_Company.marry();
//    }
}
//以婚庆公司为例 说明静态代理
//定义一个结婚功能接口
interface Marry{
    void marry();
}

//结婚人
class Bridegroom implements Marry{
    public String name;

    @Override
    public void marry() {

        System.out.println("尽快洞房->.<-");
    }
}

//婚庆公司
class Wedding_Company implements Marry{
    private Marry bridegroom;

    public Wedding_Company(Marry bridegroom) {
        this.bridegroom=bridegroom;
    }

    @Override
    public void marry() {
        before_marry();
        this.bridegroom.marry();
        aftermarry();
    }

    private void aftermarry() {
        System.out.println("婚庆公司收取尾款");
    }

    private void before_marry() {
        System.out.println("婚庆公司准备");
    }

//    void Wedding_Company(Marry bridegroom){
//        this.bridegroom=bridegroom;
//    }

}