package Composite;

public abstract class OrganizaComponent
{
     private String name;
     private String des;
     protected void add(OrganizaComponent organizaComponent){
         //默认实现
         throw new UnsupportedOperationException();
     }
    protected void remove(OrganizaComponent organizaComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }
    public OrganizaComponent(String name,String des){
         this.name=name;
         this.des=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    protected abstract void printname();
}
