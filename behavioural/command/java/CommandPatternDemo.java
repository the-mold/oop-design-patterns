// 1. The Command Interface
interface Command {
    void execute();
}

// 2. The Receiver Class
class Light {
    public void on() {
        System.out.println("The light is on");
    }

    public void off() {
        System.out.println("The light is off");
    }
}

// 3. ConcreteCommand Classes
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

// 4. The Invoker Class
class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

// 5. The Client
public class CommandPatternDemo {
    public static void main(String[] args) {
        // The Invoker
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        // The Receiver
        Light light = new Light();

        // Create commands and bind them to the receiver
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Program the remote with the "light on" command
        remote.setCommand(lightOn);
        System.out.print("Pressing button: ");
        remote.buttonWasPressed(); // Outputs: The light is on

        // Program the remote with the "light off" command
        remote.setCommand(lightOff);
        System.out.print("Pressing button: ");
        remote.buttonWasPressed(); // Outputs: The light is off
    }
}