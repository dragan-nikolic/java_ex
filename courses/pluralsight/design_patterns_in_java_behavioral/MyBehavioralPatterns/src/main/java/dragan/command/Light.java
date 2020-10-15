package dragan.command;

public class Light {
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
    }

    public void on() {
        isOn = true;
        System.out.println(this + " light switched on.");
    }

    public void off() {
        isOn = false;
        System.out.println(this + " light switched off.");
    }}
