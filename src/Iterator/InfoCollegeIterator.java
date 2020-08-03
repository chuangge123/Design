package Iterator;

import java.util.Iterator;
import java.util.List;
//信息学院的存储
public class InfoCollegeIterator implements Iterator {
    //用List方式存储
    List<Depatment>depatmentList;
    int index=-1;
//判断集合是否还有下一个元素
    @Override
    public boolean hasNext() {
        if(index>=depatmentList.size()-1){
            return false;
        }
        else {
            index +=1;
            return true;
        }
    }

//
    @Override
    public Object next() {
        return depatmentList.get(index);
    }

    @Override
    public void remove() {

    }

    public InfoCollegeIterator(List depatmentList) {
        this.depatmentList=depatmentList;
    }
}
