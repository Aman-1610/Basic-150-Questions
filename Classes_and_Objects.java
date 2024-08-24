/* Theory:

Classes and Objects: In Java, a class is a blueprint or a template that defines the properties and behavior of an object. 
An object is an instance of a class, and has its own set of attributes (data) and methods (functions).

Instance Variables: Instance variables are the data members of a class, and each object of the class has its own copy of these variables. 
In this example, model and year are instance variables of the Car class.

Methods: Methods are the functions that belong to a class, and are used to perform operations on the data of the class. 
In this example, start() is a method of the Car class.

Constructors: Constructors are special methods that are used to initialize objects when they are created. 
In this example, we didn't define a constructor, so the compiler provides a default constructor that does nothing.

Access Modifiers: Access modifiers (public, private, protected) are used to control access to classes, methods, and variables. 
In this example, the Car class and its members are public, which means they can be accessed from any other class.

Encapsulation: Encapsulation is the concept of hiding the implementation details of an object from the outside world, and only exposing the necessary information through public methods. 
In this example, the Car class encapsulates the model and year variables, and provides a public start() method to interact with the object.

Interview Questions:

1. Can you explain the difference between a class and an object?
Answer. A class is a blueprint or a template that defines the properties and behavior of an object. 
An object is an instance of a class, and has its own set of attributes (data) and methods (functions). In the code, Car is a class, and car1 is an object of the Car class.

2. What is the purpose of instance variables in a class?
Answer. Instance variables are the data members of a class, and each object of the class has its own copy of these variables. 
In the code, model and year are instance variables of the Car class, and each Car object has its own values for these variables.

3. How do you create an object of a class in Java?
Answer. To create an object of a class in Java, you use the new keyword followed by the class name and parentheses. 
In the code, Car car1 = new Car(); creates a new object of the Car class.

4. What is the difference between a method and a constructor in Java?
Answer. A method is a function that belongs to a class, and is used to perform operations on the data of the class. 
A constructor is a special method that is used to initialize objects when they are created. 
In the code, start() is a method of the Car class, and there is no constructor defined (the compiler provides a default constructor that does nothing).

5. Can you explain the concept of encapsulation in Java?
Answer. Encapsulation is the concept of hiding the implementation details of an object from the outside world, and only exposing the necessary information through public methods. 
In the code, the Car class encapsulates the model and year variables, and provides a public start() method to interact with the object.

6. How do you control access to classes, methods, and variables in Java?
Answer. Access modifiers (public, private, protected) are used to control access to classes, methods, and variables. 
In the code, the Car class and its members are public, which means they can be accessed from any other class. */

// Define a class named Car
class Car {
    // Instance variables (data members) of the class
    String model; // represents the model of the car
    int year; // represents the year of the car

    // Method of the class Car
    void start() {
        // This method simulates the action of starting the car
        System.out.println("Car started");
    }
}

// Main class
public class Classes_and_Objects {
    // Main method where the program starts execution
    public static void main(String[] args) {
        // Create an object of the Car class
        Car car1 = new Car();

        // Assign values to the instance variables of the Car object
        car1.model = "Tesla Model 3";
        car1.year = 2020;

        // Call the start() method on the Car object
        car1.start();

        // Print the values of the instance variables
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
    }
}
