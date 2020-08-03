package Composite;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Department extends OrganizaComponent {
    public Department(String name, String des) {
        super(name, des);
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
        System.out.println(getName());
    }
}
