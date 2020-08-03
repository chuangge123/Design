package Memento;

public class GameRole {
    private int vit;
    private int def;
    public Memento createMemento(){
        //以当前状态获取个对象
        return new Memento(vit,def);
    }
    //从备忘录对象恢复GameRole对象
    public void recoverGameRoleFrom(Memento memento){
        this.vit=memento.getVit();
        this.def=memento.getDef();
    }
    public void display(){
        System.out.println("游戏角色当前的攻击力"+vit+"防御力"+def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
