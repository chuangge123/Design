package Adapt.ClassAdapt;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5v() ==5){
            System.out.println("当前电压5V可以充电");
        }
        else {
            System.out.println("当前电压不安全，不要充电");
        }

    }
}
