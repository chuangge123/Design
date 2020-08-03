package Visitor;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("评测成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("评测成功*2");
    }
}
