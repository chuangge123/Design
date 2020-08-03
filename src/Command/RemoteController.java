package Command;

public class RemoteController {
    //各操作命令集合
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i=0;i<5;i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }
    public void setCommands(int o,Command oncommand,Command offCommand)
    {
        onCommands[o]=oncommand;
        offCommands[o]=offCommand;
    }
    public void onButtonWasPushed(int o){
        onCommands[o].execete();
        //记录一下 用于撤销
        undoCommand=onCommands[o];
    }
    public void offButtonWasPushed(int o){
        offCommands[o].execete();
        //记录一下 用于撤销
        undoCommand=offCommands[o];
    }
    public void undoButtonWasPushed(int o){
        undoCommand.undo();
    }
}
