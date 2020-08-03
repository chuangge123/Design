package Flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory=new WebSiteFactory();
        Website Web1=webSiteFactory.getweb("新闻联播");
        Web1.Used(new User("Tom"));
        Website Web2=webSiteFactory.getweb("炫动卡通");
        Web2.Used(new User("Jack"));
        Website Web3=webSiteFactory.getweb("炫动卡通");
        Web3.Used(new User("Nacy"));
        Website Web4=webSiteFactory.getweb("炫动卡通");
        Web4.Used(new User("Lisa"));

        System.out.println("当前频道有"+ webSiteFactory.getwebsitcount());
    }
}
