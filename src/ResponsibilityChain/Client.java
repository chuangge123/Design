package ResponsibilityChain;

public class Client {


    public static void main(String[] args) {
        //创建请求
        PurchaseRequest purchaseRequest=new PurchaseRequest(1,50000,0155464);
        //创建角色
        DepartmentApprover departmentApprover=new DepartmentApprover("张主任");
        CollegeApprover collegeApprover=new CollegeApprover("李院士");
        ViceSchool viceSchool=new ViceSchool("陈副校长");
        SchoolMastApprover schoolMastApprover=new SchoolMastApprover("孙校长");
        //设置处理顺序(处理人应该构成一个环形)//这样有些低的请求校长也能处理
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchool);
        viceSchool.setApprover(schoolMastApprover);
        schoolMastApprover.setApprover(departmentApprover);

        //请求调用，从主任处理
        departmentApprover.processRequest(purchaseRequest);
    }
}
