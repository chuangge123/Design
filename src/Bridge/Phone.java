package Bridge;

public class Phone
{
    //组合品牌
    private Brand brand;
    public Phone(Brand brand){
        this.brand = brand;
    }
    protected void open(){
        this.brand.open();
    }
    protected void close(){
        this.brand.closs();
    }
    protected void call(){
        this.brand.call();
    }
}
