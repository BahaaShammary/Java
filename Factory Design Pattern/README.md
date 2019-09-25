# Factory Design Pattern

Factory pattern is one of the most used design patterns in Java. The design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Factory pattern, you create an object without exposing the creation logic to the client and refer to newly created object using a common interface. 

In the application I built following a tutorial, was creating an abstract class of Enemy Ship, then there are different classes that extend the Enemy Ship class. Then the interface used to hide away the creation logic of enemy ships is in the class Enemy Ship Factory.
