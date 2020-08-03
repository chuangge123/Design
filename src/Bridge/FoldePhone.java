package Bridge;

public class FoldePhone extends Phone{
    public FoldePhone(Brand brand) {
        super(brand);
    }
    public void Open(){
        super.open();
        System.out.println("折叠样式");
    }
    public void Close(){
        super.close();
        System.out.println("折叠样式");
    }
    public void Call(){
        super.call();
        System.out.println("折叠样式");
    }

}
