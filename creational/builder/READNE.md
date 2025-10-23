# Builder
The Builder pattern is a creational design pattern that lets you construct complex objects step by step. It separates the construction of an object from its representation, allowing the same construction process to create different representations.

Think of it like ordering a custom computer:
- You don't build the computer yourself from a huge list of components all at once.
- Instead, you tell a "builder" what you want step-by-step: "I want this CPU," "add this much RAM," "use this graphics card."
- Once you've specified all the parts, the builder assembles the final computer for you.

# What problems does it solve?
1. Telescoping Constructors: It helps you avoid having constructors with a long list of parameters (e.g., new Computer(cpu, ram, storage, gpu, powerSupply, ...)), most of which might be optional. This makes your code hard to read and maintain.
2. Complex Object Creation: It simplifies the creation of objects that require many configuration steps or have a lot of optional parts.
3. Immutability: It allows you to make the final object immutable (unchangeable) once it's built, as all the configuration happens on the builder object, not the final product.

# Key Components
- Product: The complex object that is being built (e.g., the Computer).
- Builder: An interface that defines all the possible steps to configure the product (e.g., setCPU(), setRAM(), build()).
- Concrete Builder: A class that implements the Builder interface, keeps track of the parts as they are added, and assembles the final product.
- Director (Optional): A class that knows the specific sequence of steps to build a common type of product. For example, a GamingComputerDirector could use a builder to construct a high-end gaming PC.

# Why not just use constractor method with default params?
Because you need to specify long list of params each time or need to define many different constractors.

# Why not use setters?
If you expose setters, you make the object mutable. `Builder` pattern creats immutable objects.