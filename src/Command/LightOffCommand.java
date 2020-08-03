package Command;

public class LightOffCommand implements Command {
    LightReceiver light;
    public LightOffCommand(LightReceiver light){
        this.light=light;
    }
    @Override
    public void execete() {
        light.lightoff();
    }

    @Override
    public void undo() {
        light.lighton();
    }
}
