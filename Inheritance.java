/*
 * Theory:

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows one class to inherit the properties and behavior of another class. 
The inheriting class is called the subclass or derived class, while the class being inherited from is called the superclass or base class.

In this example, Animal is the base class, and Dog is a subclass that inherits from Animal. The eat method is defined in the Animal class and is inherited by Dog. 
The bark method is specific to Dog.

Interview Questions and Answers:

1. What is the purpose of the extends keyword in Java?
Answer: The extends keyword is used to indicate that a class is inheriting from another class.

2. Can a subclass inherit multiple base classes?
Answer: In Java, a subclass can only inherit from one base class. However, a subclass can implement multiple interfaces.

3. What is the benefit of using inheritance in programming?
Answer: Inheritance allows for code reuse, facilitates the creation of a hierarchy of related classes, and makes it easier to modify or extend the behavior of a class.

4. Can a subclass override a method from its base class?
Answer: Yes, a subclass can override a method from its base class by providing a new implementation for the method.

5. What is the difference between a base class and a subclass?
Answer: A base class is the class being inherited from, while a subclass is the class that inherits from the base class.

6. How do you create an instance of a subclass in Java?
Answer: You can create an instance of a subclass using the new keyword, just like creating an instance of any other class.
 */

// Define a base class called Animal
class Animal
{
    // Method to eat
    void eat()
    {
        System.out.println("This animal eats food");
    }
}

// Define a subclass called Dog that extends Animal
class Dog extends Animal
{
    // Method to bark
    void bark()
    {
        System.out.println("Dog barks");
    }
}

// Main class to demonstrate inheritance
public class Inheritance 
{
    public static void main(String args[])
    {
        // Create an instance of Dog
        Dog myDog=new Dog();
        // Call the eat method inherited from Animal
        myDog.eat();
        // Call the bark method specific to Dog
        myDog.bark();
    }
}