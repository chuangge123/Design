package Adapt.ClassAdapt;

public class ClassAdapt
{
    public static void main(String[] args) {
        System.out.println("=====类适配器=====");
        Phone iphone = new Phone();
        iphone.charging(new AdaptVoltage());
    }
}
