// 1. The Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// 2. ConcreteStrategy Classes
class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;

    public CreditCardStrategy(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card.");
    }
}

class PayPalStrategy implements PaymentStrategy {
    private String emailId;

    public PayPalStrategy(String email) {
        this.emailId = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}

// 3. The Context Class
class ShoppingCart {
    private int amount = 0;

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    // The context accepts a strategy from the client and uses it.
    public void pay(PaymentStrategy paymentMethod) {
        paymentMethod.pay(amount);
    }
}

// 4. The Client
public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setAmount(100);

        // The client decides which strategy to use at runtime.

        // Pay using PayPal
        System.out.println("Paying with PayPal...");
        cart.pay(new PayPalStrategy("myemail@example.com"));

        // Pay using Credit Card
        System.out.println("\nPaying with Credit Card...");
        cart.pay(new CreditCardStrategy("John Doe", "1234567890123456"));
    }
}