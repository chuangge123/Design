package Proxy.DynamicProxy;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("讲课ing");
    }

    @Override
    public void sayhello(String name) {
        System.out.println("您好"+name);
    }
}
