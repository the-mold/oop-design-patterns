package structural.decorator.java;

public class Main {
    public static void main(String[] args) {
        // Start with a simple email notifier
        Notifier notifier = new EmailNotifier();

        System.out.println("--- Sending with basic email notifier ---");
        notifier.send("Your order has been shipped!");

        // Now, decorate it with an SMS notifier
        notifier = new SMSNotifierDecorator(notifier);

        System.out.println("\n--- Sending with email + SMS notifier ---");
        notifier.send("Your package is out for delivery.");

        // Let's decorate it further with a Slack notifier
        notifier = new SlackNotifierDecorator(notifier);

        System.out.println("\n--- Sending with email + SMS + Slack notifier ---");
        notifier.send("Your package has been delivered.");

        // We can also create a different combination
        System.out.println("\n--- Sending with email + Slack only ---");
        Notifier emailAndSlack = new SlackNotifierDecorator(new EmailNotifier());
        emailAndSlack.send("A new support ticket has been created.");
    }
}
