package structural.decorator.java;

public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // First, send the original notification
        sendSMS(message);    // Then, add the new functionality
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: '" + message + "'");
    }
}
