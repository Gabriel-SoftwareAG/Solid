package DIP;

public class Switch implements Switchable{
    private Switchable switchable;

    public Switch(Switchable switchable){
        this.switchable = switchable;
    }
    @Override
    public void turnOn() {
        switchable.turnOn();
    }

    @Override
    public void turnOff() {
        switchable.turnOff();
    }
}
