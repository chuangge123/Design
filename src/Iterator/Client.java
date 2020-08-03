package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> collegeList=new ArrayList<College>();
        ComputerCollege computerCollege= new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);
        OutPutimpl outPutimpl=new OutPutimpl(collegeList);
        outPutimpl.printCollege();
    }
}
