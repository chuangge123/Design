package Visitor;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("评测失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("评测失败*2");
    }
}
