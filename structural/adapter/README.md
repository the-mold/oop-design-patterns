# Adapter
Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate. It acts as a wrapper or a translator between two interfaces, making them work together without changing their source code.

Think of it like a travel power adapter. Your laptop charger has a plug designed for your country's outlets. When you travel to a country with different outlets, you don't buy a new laptop. Instead, you use an adapter that fits into the foreign outlet on one end and accepts your charger's plug on the other.

## What Problems Does It Solve?
- Incompatible Interfaces: It's used when you want to use an existing class, but its interface is not compatible with the one you need.
- Legacy Code Integration: It's great for making new code work with older, legacy systems that you can't or don't want to change.
- Third-Party Libraries: It helps integrate third-party libraries that have a different interface from the one your application expects.

