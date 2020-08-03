package Memento;

import java.util.ArrayList;
import java.util.HashMap;

//守护者，为保存游戏角色状态
public class Caretaker {
    private Memento memento;
//    private ArrayList<Memento> mementos;
//    private HashMap<String,ArrayList<Memento>> rolesMemento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
