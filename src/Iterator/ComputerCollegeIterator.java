package Iterator;

import java.util.Iterator;
//计算机学院的存储
public class ComputerCollegeIterator implements Iterator {
    //存放Depatment
    Depatment[] depatments;
    //遍历位置
    int position=0;
    //判断数组是否还有下一个
    @Override
    public boolean hasNext() {
        if(position >=depatments.length || depatments[position] ==null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        Depatment depatment=depatments[position];
        position +=1;
        return depatment;
    }
    //空实现删除方法
    @Override
    public void remove(){

    }

    public ComputerCollegeIterator(Depatment[] depatments) {
        this.depatments = depatments;
    }
}
