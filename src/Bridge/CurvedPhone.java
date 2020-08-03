package Bridge;

public class CurvedPhone extends Phone{
    public CurvedPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void open(){
        super.open();
        System.out.println("曲面样式");
    }
    @Override
    public void close(){
        super.close();
        System.out.println("曲面样式");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("曲面样式");
    }
}
