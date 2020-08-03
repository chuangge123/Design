package ResponsibilityChain;

public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()<=5000 && purchaseRequest.getPrice()<=10000){
            System.out.println("请求编号"+purchaseRequest.getId()+"被"+this.name+"处理了");
        }
        else {
            approver.processRequest(purchaseRequest);
        }
    }
}
