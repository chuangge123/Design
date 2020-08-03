package Composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizaComponent {
    List<OrganizaComponent> organizaComponents= new ArrayList<OrganizaComponent>(); //聚合管理类
    public College(String name, String des) {
        super(name, des);
    }
    @Override
    protected void add(OrganizaComponent organizaComponent){
        organizaComponents.add(organizaComponent);
    }

    @Override
    protected void remove(OrganizaComponent organizaComponent) {
        organizaComponents.remove(organizaComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void printname() {
        System.out.println("----------"+getName()+"------------");
        for(OrganizaComponent organizaComponent:organizaComponents){
            organizaComponent.printname();
        }
    }
}
