package Memento;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole=new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("装备毁坏之前状态为：");
        gameRole.display();
        Caretaker caretaker=new Caretaker();
        System.out.println("准备保存状态");
        caretaker.setMemento(gameRole.createMemento());
        System.out.println("保存完毕、准备强化");
        System.out.println("强化失败，攻击力防御力降低为");
        gameRole.setVit(50);
        gameRole.setVit(50);
        gameRole.display();
        System.out.println("联系马爹，数据恢复");
        gameRole.recoverGameRoleFrom(caretaker.getMemento());
        System.out.println("恢复了");
        gameRole.display();

    }
}
