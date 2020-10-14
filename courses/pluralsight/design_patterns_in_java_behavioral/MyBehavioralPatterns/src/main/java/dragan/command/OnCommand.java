package dragan.command;

public class OnCommand implements Command {
    private Light light;

    public void OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
