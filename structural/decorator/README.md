# Decorator
Decorator pattern is a structural design pattern that lets you attach new behaviors to objects dynamically by placing them inside special wrapper objects that contain the behaviors.

Think of it like getting dressed. You start with a basic outfit (the object). If it's cold, you can "decorate" yourself with a coat. If it's raining, you can add another decoration: an umbrella. You are adding new functionality (warmth, staying dry) to yourself without changing your fundamental nature. You can also add these decorations in any order.

## What Problems Does It Solve?
1. Static Inheritance: It provides a flexible alternative to subclassing for extending functionality. Inheritance is static—you can't change the behavior of an existing object at runtime. With decorators, you can.
2. Class Explosion: If you need to support many different combinations of features, using inheritance can lead to a huge number of subclasses (e.g., Notifier, EmailNotifier, SMSNotifier, EmailAndSMSNotifier, EmailAndSMSAndSlackNotifier...). Decorators let you add these features independently.
3. Single Responsibility Principle: It allows you to have a core class with a single responsibility, and then add optional features with decorator classes.

## Example: Notification System
Imagine you have a simple notification system that sends an email. Now, you want to add the ability to also send notifications via SMS and Slack. Instead of creating subclasses for every possible combination, we can use decorators.

