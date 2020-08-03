package DesignPrinciples;

//A实现接口。B通过依赖接口使用A的first方法   可以看到B 既有接口方法 还有自己的方法 很方便
//单一职责、接口隔离、
//保持接口独立原则- 就是把每个方法都尽量拆分成一个个小接口 与实现类。——策略模式就是这个意思。

public class Segragation
{
    public static void main(String[] args) {
      new B().two(new A());

    }
}

interface Interface1{
    void first();
}

class A implements Interface1{
    @Override
    public void first() {
        System.out.println("我是派大星");
    }
}
class B{
    public void two(Interface1 interface1){  //这里我发现传递的对象 是接口 和A对象 结果是一样的。
                            //为甚传递 Interface类型呢，因为未来有新的子类 也实现接口 first ()方法说是章鱼哥  这时 就体现出了传递父类的好处。
                                    //这个就是依赖倒转原则，要依赖虚拟的类 。
        System.out.println("我是海绵宝宝呼叫派大星");
        interface1.first();
    }
}
