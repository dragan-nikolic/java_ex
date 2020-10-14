package dragan.command;

public class Switch {
    public void storeAndExecute(Command toggleCommand) {
        toggleCommand.execute();
    }
}
