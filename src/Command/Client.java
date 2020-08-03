package Command;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver=new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand=new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommands(0,lightOnCommand,lightOffCommand);

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
    }
}
