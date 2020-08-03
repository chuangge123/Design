package Adapt.ObjectAdapt;

public class AdaptVoltage  implements IVoltage5V {
    Voltage220V voltage220V;
    public  AdaptVoltage(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }
    @Override
    public int output5v() {
        int dstv =0;
        if (null !=voltage220V) {
            int srcV = voltage220V.output220V(); //用继承过来的220V电压
            System.out.println("电压适配器正在启动");
            dstv = srcV / 44; // 实现需求电压的接口，转成5V
            System.out.println("适配完成，当前电压为"+dstv);
//            return dstv;
        }
        return dstv;
    }
}
