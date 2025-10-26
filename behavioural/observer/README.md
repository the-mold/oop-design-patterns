The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects. When one object (the "subject" or "observable") changes its state, all its dependent objects (the "observers") are notified and updated automatically.

This pattern promotes loose coupling—the subject only knows that it has a list of observers, not what they are or what they do.

Key Concepts
Subject (or Observable): An interface or abstract class for the object that will be observed. It contains methods for attaching (register), detaching (unregister), and notifying observers.
ConcreteSubject: The actual object that stores the state of interest. It maintains a list of its observers and sends a notification to them whenever its state changes.
Observer: An interface for objects that need to be notified of changes. It typically declares an update() method.
ConcreteObserver: Implements the Observer interface. Each observer registers with a ConcreteSubject to receive updates.
Analogy: Magazine Subscription
Subject: The magazine publisher (e.g., "National Geographic").
Observers: The subscribers who have signed up for the magazine.
When the publisher releases a new issue (a state change), it automatically sends a copy to every subscriber on its list. The subscribers don't need to constantly call the publisher to ask if a new issue is out; they are notified automatically.