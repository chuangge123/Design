package Mediator;

public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建这个类的对象时，先把自己传入到ConcreteMediator对象集合中，相当于注册。
        mediator.Register(name,this);
    }

    @Override
    public void Sendmessages(int stateChange) {
        this.GetMediator().GetMessage(stateChange,this.name);
    }
    public void SendAlarm(int stateChange){Sendmessages(stateChange);}
}
