package DIP;

public class Main {
    public static void main(String[] args){
        Switchable light = new Light();
        Switch switcher = new Switch(light);
        switcher.turnOn();
        switcher.turnOff();

        Switchable fan = new Fan();
        switcher = new Switch(fan);
        switcher.turnOn();
        switcher.turnOff();
    }
}
