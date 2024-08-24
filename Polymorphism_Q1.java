/*
 * Q1: What is polymorphism in Java?

A1: Polymorphism is the ability of an object to take on multiple forms. In Java, this is achieved through method overriding or method overloading. In this example, the draw() method is overridden in each subclass to provide a specific implementation for each shape.

Q2: What is method overriding in Java?

A2: Method overriding is a feature of Java that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. In this example, the draw() method is overridden in each subclass to provide a specific implementation for each shape.

Q3: What is the purpose of the @Override annotation in Java?

A3: The @Override annotation is used to inform the compiler that a method is intended to override a method in a superclass. This helps the compiler to check if the method is correctly overridden and prevents errors.

Q4: What is the benefit of using polymorphism in this example?

A4: The benefit of using polymorphism in this example is that it allows us to treat all shapes as instances of the Shape class, without knowing their specific type. This makes the code more flexible and easier to maintain.

Q5: How does the for-each loop work in this example?

A5: The for-each loop iterates through the shapes array and assigns each element to a variable shape of type Shape. This allows us to call the draw() method on each shape without knowing its specific type.

Q6: What would happen if we didn't override the draw() method in each subclass?

A6: If we didn't override the draw() method in each subclass, the draw() method of the Shape class would be called for each shape, resulting in the output "Drawing a shape" for each shape. This would not be the desired behavior, as we want each shape to have its own specific implementation of the draw() method.
 */

// Define a base class Shape with a method draw()
class Shape {
    // Method to draw a shape
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Define a subclass Circle that extends Shape
class Circle extends Shape {
    // Override the draw() method to draw a circle
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Define a subclass Square that extends Shape
class Square extends Shape {
    // Override the draw() method to draw a square
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

// Define a subclass Triangle that extends Shape
class Triangle extends Shape {
    // Override the draw() method to draw a triangle
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Main class to demonstrate polymorphism
public class Polymorphism_Q1 {
    // Main method to test polymorphism
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = {
            new Circle(),
            new Square(),
            new Triangle()
        };

        // Iterate through the array and call the draw() method on each shape
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}