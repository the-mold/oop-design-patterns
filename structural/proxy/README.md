
# Proxy
The Proxy pattern is a structural pattern that provides a surrogate or placeholder for another object to control access to it. It allows you to add a layer of control when you don't want clients to interact with the original object directly.

This is useful for many reasons, such as:

- Lazy Initialization (Virtual Proxy): Creating an expensive object only when it's actually needed.
- Access Control (Protection Proxy): Restricting access to the real object based on permissions.
- Logging (Logging Proxy): Logging method calls before or after forwarding them to the real object.
- Caching (Caching Proxy): Storing the results of expensive operations and returning the cached result for subsequent calls.

## Key Concepts
- Subject Interface: An interface that both the RealSubject and the Proxy implement. This allows the client to treat the proxy just like the real object.
- RealSubject: The actual object that the proxy represents. This is the object that has the core business logic.
- Proxy: The object that controls access to the RealSubject. It maintains a reference to the RealSubject and can perform additional tasks (like checking permissions or logging) before or after delegating the request.

## Analogy: A Company's Customer Service
Think of a large company's customer service system.

The RealSubject is a high-level engineer or manager who can solve complex problems.
The Proxy is the first-line customer support agent.
When you call, you don't speak directly to the engineer. The support agent (Proxy) handles your request. They can:

- Answer simple questions themselves (caching).
- Check if you are an authorized customer (access control).
- Log the details of your call (logging).
- Only escalate the call to the engineer (the RealSubject) if necessary (lazy initialization/access control).