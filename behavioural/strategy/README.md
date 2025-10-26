The Strategy pattern is a behavioral design pattern that enables selecting an algorithm at runtime. Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a family of algorithms to use.

It lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable. This allows the algorithm to vary independently from the clients that use it.

Key Concepts
Context: The object that uses a Strategy. It maintains a reference to a Strategy object and delegates the work to it. The Context is not aware of the concrete implementation of the algorithm; it just knows the interface.
Strategy: An interface that is common to all supported algorithms. The Context uses this interface to call the algorithm defined by a ConcreteStrategy.
ConcreteStrategy: Classes that implement the Strategy interface, providing the actual implementation of an algorithm.
Analogy: Navigation App
Think of a navigation app like Google Maps.

Context: The main navigation screen that shows your route.
Strategies: Different modes of transport: DrivingStrategy, WalkingStrategy, PublicTransportStrategy.
When you ask for directions, you choose a strategy (driving, walking, etc.). The app (Context) then uses the selected strategy object to calculate and display the route. You can switch strategies on the fly (e.g., from driving to walking), and the app's behavior changes accordingly, without changing the main navigation screen itself.


## When to use state and when to use strategy
- Use Strategy when you want to switch out different ways of doing the same thing (e.g., different sorting algorithms, payment methods, compression algorithms). Think of it as a pluggable algorithm.
- Use State when an object has a complex lifecycle with distinct stages, and its behavior changes significantly in each stage. Think of it as a more elegant alternative to a giant switch statement in your main object.
