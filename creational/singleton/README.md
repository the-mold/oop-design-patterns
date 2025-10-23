# Singleton
The Singleton pattern is a creational design pattern that ensures a class has only one instance and provides a single, global point of access to it.

It's used when exactly one object is needed to coordinate actions across a system. Common use cases include:
- Managing a shared resource: Such as a single database connection, a file manager, or a print spooler.
- A single point for logging: One logger instance for the entire application.
- Configuration settings: A single object to hold and provide access to application-wide configuration settings.

Key Characteristics:
- Private Constructor: To prevent other classes from creating a new instance using the new operator.
- Private Static Instance: The class holds a reference to the single instance of itself.
- Public Static Method: A method (commonly named getInstance()) that provides the single point of access to the instance. It creates the instance if it doesn't exist and returns it.
