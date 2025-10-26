# Facade
The Facade pattern is a structural design pattern that provides a simplified, higher-level interface to a complex subsystem of classes. It's like creating a simple "front-facing" menu for a complicated piece of machinery.

The main goal is to decouple the client (the code that uses the subsystem) from the complex inner workings of that subsystem.

Key Concepts
- Facade: A single class that provides simplified methods to the client. It knows how to delegate the client's requests to the appropriate objects within the subsystem.
- Subsystem Classes: A set of complex classes that implement the low-level functionality. The Facade wraps these classes, but the client doesn't interact with them directly.
- Client: The code that needs to access the subsystem's functionality. The client interacts only with the Facade.

Analogy: Home Theater System
Think of a home theater system with a projector, a screen, a sound system, and a DVD player. To watch a movie, you have to perform several steps in a specific order:

- Turn on the projector.
- Lower the screen.
- Set the projector to the correct input.
- Turn on the sound system.
- Set the volume.
- Turn on the DVD player and play the movie.

A Facade would be a single "Watch Movie" button on a universal remote. When you press it, the remote (the Facade) handles all those complex steps for you.