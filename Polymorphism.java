/*
 * Theory:

Polymorphism:

Polymorphism is a concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. 
This is achieved through method overriding or method overloading.

Method Overriding:

Method overriding is a feature of Java that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. 
The method in the subclass has the same name, return type, and parameter list as the method in the superclass, but it can have a different implementation.

Inheritance:

Inheritance is a mechanism in object-oriented programming that allows one class to inherit the properties and behavior of another class. 
The subclass inherits all the fields and methods of the superclass and can also add new fields and methods or override the ones inherited from the superclass.

Polymorphic Behavior:

Polymorphic behavior is the ability of an object to take on multiple forms. This can be achieved through method overriding or method overloading. 
In the example code, the sound() method is overridden in each subclass to provide a specific implementation for each animal. 
This allows the main() method to treat all animals as instances of the Animal class, without knowing their specific type.

Benefits of Polymorphism:

The benefits of polymorphism include:

Increased flexibility: Polymorphism allows objects of different classes to be treated as objects of a common superclass.
Improved code reusability: Polymorphism allows code to be written in a way that is independent of the specific class of an object.
Easier maintenance: Polymorphism makes it easier to add new classes or modify existing classes without affecting the rest of the code.
Interview Questions and Answers:

Q1: What is polymorphism in Java?

A1: Polymorphism is the ability of an object to take on multiple forms. In Java, this is achieved through method overriding or method overloading.

Q2: What is method overriding in Java?

A2: Method overriding is a feature of Java that allows a subclass to provide a specific implementation for a method that is already defined in its superclass.

Q3: What is the purpose of the @Override annotation in Java?

A3: The @Override annotation is used to inform the compiler that a method is intended to override a method in a superclass.

Q4: What is the benefit of using polymorphism in this example?

A4: The benefit of using polymorphism in this example is that it allows us to treat all animals as instances of the Animal class, without knowing their specific type.

Q5: How does polymorphism work in this example?

A5: Polymorphism works in this example by allowing the sound() method to be called on objects of type Animal, even though the actual object is of type Cat or Dog. 
The correct implementation of the sound() method is called based on the actual type of the object.

Q6: What would happen if we didn't override the sound() method in each subclass?

A6: If we didn't override the sound() method in each subclass, the sound() method of the Animal class would be called for each animal, resulting in the output "This animal makes a sound" for each animal. 
This would not be the desired behavior, as we want each animal to have its own specific implementation of the sound() method.
 */

// Define a base class Animal with a method sound()
class Animal 
{
    // Method to make a sound
    void sound() 
    {
        System.out.println("This animal makes a sound");
    }
}

// Define a subclass Cat that extends Animal
class Cat extends Animal 
{
    // Override the sound() method to make a cat sound
    @Override
    void sound() 
    {
        System.out.println("Cat meows");
    }
}

// Define a subclass Dog that extends Animal
class Dog extends Animal 
{
    // Override the sound() method to make a dog sound
    @Override
    void sound() 
    {
        System.out.println("Dog barks");
    }
}

// Main class to demonstrate polymorphism
public class Polymorphism 
{
    // Main method to test polymorphism
    public static void main(String args[])    
    {
        // Create an Animal object and assign it a Cat object
        Animal myCat = new Cat();
        
        // Create an Animal object and assign it a Dog object
        Animal myDog = new Dog();
        
        // Call the sound() method on the Cat object
        myCat.sound();
        
        // Call the sound() method on the Dog object
        myDog.sound();
    }
}