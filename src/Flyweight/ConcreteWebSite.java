package Flyweight;

public class ConcreteWebSite extends Website
{
    private String Type="";

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public ConcreteWebSite(String Type){
        this.Type=Type;
    }

    @Override
    public void Used(User user) {
        System.out.println("网站发布方式为"+Type+"使用者"+user.getName());
    }
}
