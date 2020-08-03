package Adapt.InterFaceAdapt;

public class client
{
    public static void main(String[] args) {
        Interface4 interface4= new Implement4() {
            @Override
            public void opreation2() {
                System.out.println("正在调用2方法");
            }
        };
        interface4.opreation2();
    }

}
