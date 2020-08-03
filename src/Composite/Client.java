package Composite;

public class Client {
    public static void main(String[] args) {
        //需要从大到小依次建立
        //新建大学
        OrganizaComponent university = new University("清华","顶级985");
        //新建学院
        OrganizaComponent college1 =new College("计算机系","大学最好的系");
        OrganizaComponent college2 = new College("软件工程","从计算机系分出");
        //新建系 加入到学院
        college1.add(new Department("计网","计网200人"));
        college1.add(new Department("单片机","300人"));
        college1.add(new Department("网络工程","400人"));
        //最后将建立好的院加入到大学
        university.add(college1);
        university.add(college2);
        college1.printname();
    }
}
