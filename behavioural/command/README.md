# Command
The Command pattern is a behavioral design pattern that turns a request into a stand-alone object containing all information about the request. This transformation lets you decouple the object that invokes an operation from the object that knows how to perform it.

This is useful for:

Parameterizing objects with operations.
Queuing, logging, or scheduling requests.
Implementing undoable operations.
Key Concepts
Command: An interface that declares a single method, typically execute().
ConcreteCommand: A class that implements the Command interface. It binds a Receiver object to a specific action. The execute() method in a ConcreteCommand calls the corresponding action on its Receiver.
Receiver: The object that contains the actual business logic and knows how to perform the requested operation.
Invoker: The object that asks the Command to carry out a request. The Invoker doesn't need to know how the request will be handled; it only knows how to trigger the execute() method.
Client: The object that creates a ConcreteCommand and sets its Receiver. It then associates the command with an Invoker.
Analogy: Ordering Food at a Restaurant
Client: You, the customer, deciding what to order.
Invoker: The waiter, who takes your order but doesn't cook it.
Command: The order ticket the waiter writes down. It contains all the information (e.g., "Steak, medium-rare").
Receiver: The chef in the kitchen, who reads the ticket and knows how to cook the steak.
The waiter (Invoker) doesn't know how to cook. They just take the order (Command) and pass it to the kitchen. The chef (Receiver) executes the command without ever interacting with you (Client).