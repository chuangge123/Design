package Flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    private HashMap<String,ConcreteWebSite> pool =new HashMap<>();
    public Website getweb(String Type){
        if(!pool.containsKey(Type)){
            pool.put(Type,new ConcreteWebSite(Type));
        }
        return (Website) pool.get(Type);
    }
     public int getwebsitcount(){
        return pool.size();
    }
}
