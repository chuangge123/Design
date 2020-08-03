package Adapt.ClassAdapt;

public class AdaptVoltage extends Voltage220V implements IVoltage5V {
    @Override
    public int output5v() {
        int srcV=output220V(); //用继承过来的220V电压
        int dstv = srcV / 44; // 实现需求电压的接口，转成5V
        return dstv;
    }
}
