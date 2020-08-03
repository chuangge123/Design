package Mediator;

public abstract class Mediator {
    //注册
    public abstract void Register(String collegueName,Colleague colleague);
    //接收消息
    public abstract void GetMessage(int stateChange,String colleague);

    public abstract void Sendmessage();
}
