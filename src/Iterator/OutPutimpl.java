package Iterator;

import java.util.Iterator;
import java.util.List;

public class OutPutimpl {
    List<College> collegeList;

    public OutPutimpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }
    public void PrintDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Depatment d = (Depatment) iterator.next();
            System.out.println(d.getName());
        }
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println(college.getName());
            PrintDepartment(college.creatItrator());
        }
    }
}
