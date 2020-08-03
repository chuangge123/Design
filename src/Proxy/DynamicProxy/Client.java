package Proxy.DynamicProxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance= (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("返回对象为"+proxyInstance);
        System.out.println("返回对象类型为"+proxyInstance.getClass());
        proxyInstance.teach();
        proxyInstance.sayhello("chuang");
    }
}
