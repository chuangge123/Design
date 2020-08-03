package singleton;

public class Mgr03 {
    private Mgr03(){}
    private static class mgr03hold{
        private static final Mgr03 Instance = new Mgr03();

    }
    public static Mgr03 getInstance(){
        return mgr03hold.Instance;
    }
}
