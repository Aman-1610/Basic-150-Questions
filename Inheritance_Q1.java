/*
 * Theory:

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class to inherit the properties and behavior of another class. 
The inheriting class is called the subclass or derived class, while the class being inherited from is called the superclass or base class.

In this example, Vehicle is the base class, and Car and Motorcycle are subclasses that inherit from Vehicle. 
The startEngine method is defined in the Vehicle class and is inherited by both Car and Motorcycle. The openTrunk method is specific to Car, and the popWheelie method is specific to Motorcycle.

Interview Questions and Answers:

1. What is inheritance in OOP?
Answer: Inheritance is a mechanism in OOP that allows one class to inherit the properties and behavior of another class.

2. What is the difference between a base class and a subclass?
Answer: A base class is the class being inherited from, while a subclass is the class that inherits from the base class.

3. Can a subclass inherit multiple base classes?
Answer: In Java, a subclass can only inherit from one base class. However, a subclass can implement multiple interfaces.

4. What is the purpose of the extends keyword in Java?
Answer: The extends keyword is used to indicate that a class is inheriting from another class.

5. Can a subclass override a method from its base class?
Answer: Yes, a subclass can override a method from its base class by providing a new implementation for the method.

6. What is the benefit of using inheritance in programming?
Answer: Inheritance allows for code reuse, facilitates the creation of a hierarchy of related classes, and makes it easier to modify or extend the behavior of a class.
 */

class Vehicle
{
    // Method to start the engine
    void startEngine()
    {
        System.out.println("Vehicle Started.");
    }
}

class Car extends Vehicle
{
    // Method to open the trunk
    void openTrunk()
    {
        System.out.println("Trunk Opened.");
    }
}

class Motorcycle extends Vehicle
{
    // Method to pop a wheelie
    void popWheelie()
    {
        System.out.println("Wheelie popped");
    }
}

public class Inheritance_Q1 
{    
    public static void main(String args[])
    {
        // Create an instance of Car
        Car myCar = new Car();
        myCar.startEngine();
        myCar.openTrunk();

        // Create an instance of Motorcycle
        Motorcycle myBike = new Motorcycle();
        myBike.startEngine();
        myBike.popWheelie();
    }
}