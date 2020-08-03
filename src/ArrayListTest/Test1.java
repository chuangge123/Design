package ArrayListTest;

import java.util.ArrayList;

public class Test1 {


//    public static void main(String[] args) {
//        ArrayList<Integer> list= new ArrayList<Integer>();
//        list.add(58);
//        list.add(59);
//        list.add(57);
//        list.add(56);
//        for (Integer i : list){
//            System.out.println(i);
//        }
//    }
    public static void main(String[] args) {
        //默认为Object类
        Order order = new Order();
        order.setOrderT("chuangsun");
        Order<String> order1 = new Order<String>("chuangsun",10086,"china");
        order1.setOrderT("chinese");

    }

}
