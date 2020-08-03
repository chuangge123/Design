package Command;

public class LightOnCommand implements Command {
    LightReceiver light;
    public LightOnCommand(LightReceiver light){
        super();
        this.light=light;
    }
    @Override
    public void execete() {
        light.lighton();
    }

    @Override
    public void undo() {
        light.lightoff();
    }
}
