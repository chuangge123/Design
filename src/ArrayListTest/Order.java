package ArrayListTest;

public class Order<T> {
    String orderName;
    int orderID;
    T orderT;

    public Order(String orderName,int orderID,T orderT){
        this.orderID=orderID;
        this.orderName=orderName;
        this.orderT=orderT;
    }
    public Order(){}

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }
}

