# State
The State pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. The object appears to change its class. Instead of using large conditional statements (if/else or switch) within the object to manage behavior, you encapsulate the state-specific logic into separate classes.

Key Concepts
Context: The object that has a state. It maintains a reference to a ConcreteState object that represents its current state. The Context delegates state-specific behavior to the current state object.
State: An interface or abstract class that defines the methods for all state-specific behaviors.
ConcreteState: Classes that implement the State interface. Each ConcreteState provides the implementation for the behavior associated with a particular state of the Context. It can also handle the transition of the Context to a new state.
Analogy: Vending Machine
A vending machine is a perfect analogy for the State pattern.

Context: The vending machine itself.
States: NoCoinState, HasCoinState, SoldState, EmptyState.
The machine's response to an action depends entirely on its current state:

If you insert a coin when it's in the NoCoinState, it transitions to the HasCoinState.
If you press the dispense button in the HasCoinState, it gives you an item and transitions to the SoldState (or back to NoCoinState).
If you press the dispense button in the NoCoinState, nothing happens.
