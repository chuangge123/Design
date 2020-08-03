package Command;

public interface Command {
    //执行操作
    public void execete();
    //撤销操作
    public void undo();
}
