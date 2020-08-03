package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {
    List<Depatment> depatmentList;
    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Depatment depatment = new Depatment(name,desc);
        depatmentList.add(depatment);
    }

    @Override
    public Iterator creatItrator() {
        return new InfoCollegeIterator(depatmentList);
    }

    public InfoCollege() {
        depatmentList = new ArrayList<Depatment>();
        addDepartment("网络安全","信息安全专业");
        addDepartment("网络攻防","信息安全专业");
        addDepartment("网络执行","信息安全专业");

    }
}
