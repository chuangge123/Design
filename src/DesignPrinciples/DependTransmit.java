package DesignPrinciples;
//依赖的传递方式
//依赖反转、里氏替换
public class DependTransmit
{
    public static void main(String[] args) {
    /*    //方式1
        new OpenAndClose().open(new HandOpen());*/

    /*//方式2
        new TVopen(new HandOpen()).open();*/

    //方式3
        new TVOpen().open();
        new TVOpen().setter(new HandOpen());
    }
}


//方式一
// 通过接口实现依赖传递，在复写open 方法时 必须传递一个开机方式的接口、实现后通过判断
/*
interface IopenAndClose{
    public void open(ITV tv);
}
interface ITV{
    public void play();
}
class OpenAndClose implements IopenAndClose{

    @Override
    public void open(ITV tv) {
        System.out.println("我开机了");
        tv.play();
    }
}
class HandOpen implements ITV{
    @Override
    public void play() {
        System.out.println("开机方式为手动");
    }
}
*/

//方式二
// 通过构造器进行传递
/*
interface IopenAndClose{
    public void open();
}
interface ITV{
    public void play();
}
class TVopen implements IopenAndClose{
    ITV itv; //成员
    @Override
    public void open() {
        System.out.println("电视准备开机");
    }
    public TVopen(ITV itv){
        itv.play();
    }
}
class HandOpen implements ITV{
    @Override
    public void play() {
        System.out.println("启动方式为手动");
    }
}*/


//方式三
//在接口种多写一个setter方法
interface IopenAndClose{
    public void open();
    public void setter(ITV itv);
}
interface ITV{
    public void play();
}
class HandOpen implements ITV{
    @Override
    public void play() {
        System.out.println("启动方式为手动");
    }
}

class TVOpen implements IopenAndClose{
    @Override
    public void open() {
        System.out.println("电视已经开启");
    }
    ITV itv;

    @Override
    public void setter(ITV itv) {
        itv.play();
    }
}
