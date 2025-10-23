# Abstract factory
The key idea of the Abstract Factory pattern is to provide an interface for creating families of related objects without specifying their concrete classes.

# Eample code:
1. Families of Related Objects: We have two "families" of products:
- Road Logistics Family: Truck and Box. These objects are meant to be used together.
- Sea Logistics Family: Ship and Crate. These are also meant to be used together.
2. Abstract Factory (LogisticsFactory): This is an interface that declares a set of methods for creating the objects of a single family. It has createTransport() and createPackaging(). It doesn't know which kind of transport or packaging it will create; it just knows it has to create one of each.
3. Concrete Factories (RoadLogisticsFactory, SeaLogisticsFactory): These are the classes that actually implement the creation logic.
- RoadLogisticsFactory creates a Truck and a Box.
- SeaLogisticsFactory creates a Ship and a Crate.
The main benefit is that the client code that uses the factory doesn't need to worry about making sure the products are compatible. If you get a RoadLogisticsFactory, you are guaranteed that when you call its creation methods, you will get a Truck and a Box—a consistent set. You won't accidentally get a Ship and a Box.
