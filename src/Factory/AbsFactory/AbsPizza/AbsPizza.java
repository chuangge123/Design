package Factory.AbsFactory.AbsPizza;

public abstract class AbsPizza
{
    protected String name; //pizza名字
    //准备pizza 不同的pizza 准备的不同
    public abstract void prepare();

    public void bake()
    {
        System.out.println("正在烘烤"+name);
    }

    public void cut()
    {
        System.out.println("正在切割"+name);
    }

    public void box()
    {
        System.out.println("正在打包"+name);
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
