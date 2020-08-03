package Iterator;

import java.util.Iterator;

public class ComputerCollege implements College {
    Depatment[] depatments;
    int numofDepatment=0; //为了保存当前数组对象个数
    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Depatment depatment=new Depatment(name,desc);
        depatments[numofDepatment]=depatment;
        numofDepatment +=1;
    }

    @Override
    public Iterator creatItrator() {
        return new ComputerCollegeIterator(depatments);
    }

    public ComputerCollege() {
        depatments = new Depatment[5];
        addDepartment("Java","编程语言");
        addDepartment("PHP","编程语言");
        addDepartment("C++","编程语言");
        addDepartment("Python","编程语言");
    }
}
