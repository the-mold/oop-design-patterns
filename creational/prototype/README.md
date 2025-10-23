# Prototype
The Prototype pattern is a creational design pattern that lets you create new objects by copying an existing object, known as the "prototype." It's like cloning a sheep: instead of creating a new sheep from scratch (which is complex), you take an existing sheep and create an exact copy.

## How It Works in Java
In Java, this is typically achieved by implementing the Cloneable interface and overriding the clone() method from the Object class.

## What Problems Does It Solve?
1. Expensive Object Creation: It's useful when creating an object is a costly operation (e.g., it requires a database query, a network call, or complex calculations). Cloning an existing instance can be much faster.
2. Hiding Complexity: It allows you to create new objects without being coupled to their concrete classes. Your client code can get a new object by asking a prototype to clone itself, without needing to know the exact class of that object.

## Example code
1. Shape.java: An abstract class that implements Cloneable. This is our base prototype.
2. Circle.java & Rectangle.java: Concrete implementations of Shape. These are the objects we want to clone.
3. ShapeCache.java: This class acts as a prototype manager. It pre-loads instances of our shapes into a Hashtable. The getShape() method returns a clone of the stored object, not the original instance. This simulates a scenario where creating the initial objects is expensive (e.g., loading them from a database), so we do it only once.
