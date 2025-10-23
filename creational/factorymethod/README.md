# Factory Method
The Factory Method pattern is when a parent class defines a method for creating an object, but lets its child classes decide exactly which kind of object to create. Parent class defines an abstract "factory method" and says to its children: "I don't know what specific object to create, but I know that one is needed. It's your job to create it."

# Key Components
- Product: An **interface or abstract class** for the objects the factory method will create.
- ConcreteProduct: Concrete classes that implement the Product interface.
- Creator: An **abstract class** that declares the factory method, which returns a Product object. It can also contain business logic that relies on the Product.
- ConcreteCreator: Subclasses that override the factory method to return a specific ConcreteProduct.

# Example implementation(see code):
1. The Logistics class says: "I have a planDelivery method that needs a Transport object. I don't know how to make one, so I'm declaring an abstract createTransport() method. It's a promise that any of my concrete children will know how."
2. The RoadLogistics class says: "I am a child of Logistics. I will fulfill the promise. My version of createTransport() will return a new Truck()."
3. The SeaLogistics class says: "I am also a child of Logistics. I will also fulfill the promise. My version of createTransport() will return a new Ship()."

# Why is it useful?
The Factory Method pattern is beneficial because it:
- Isolates Creation Logic: Moves the responsibility of which object to create out of your main business logic and into dedicated factory classes.
- Reduces Coupling: Your client code depends on abstract interfaces (Logistics, Transport) instead of concrete implementations (Truck, Ship).
- Promotes Extensibility: You can introduce new products and creators into the app without breaking or even touching the existing client code. This makes your system more flexible and easier to maintain in the long run.


# Bad way to implement code if you DO NOT use factory method:
```
// The "bad" way, without the pattern
import com.example.logistics.transport.Transport;
import com.example.logistics.transport.Truck; // <-- Tightly coupled
import com.example.logistics.transport.Ship;  // <-- Tightly coupled

public class Main {
    public static void main(String[] args) {
        String config = "Road"; // Comes from a config file, user input, etc.
        Transport transport;

        // Problem 1: Your main logic is cluttered with object creation details.
        if (config.equalsIgnoreCase("Road")) {
            transport = new Truck();
        } else if (config.equalsIgnoreCase("Sea")) {
            transport = new Ship();
        } else {
            throw new IllegalArgumentException("Unknown transport type");
        }

        // Now, use the object
        System.out.println("Planning delivery...");
        transport.deliver();
    }
}
```
Problems:
1. Tight Coupling: Your Main class is now directly tied to the Truck and Ship classes. It has to know they exist and how to instantiate them (new Truck()).
2. Violation of Open/Closed Principle: What happens when your company expands and adds air freight?
- You have to create an Airplane.java class.
- You then have to go back and modify the Main class to add another else if block: else if (config.equalsIgnoreCase("Air")) { transport = new Airplane(); }.
- Changing existing, working code is risky and violates the Open/Closed Principle (which states that code should be open for extension, but closed for modification).
