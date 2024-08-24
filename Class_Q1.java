/* 
 * Theory:

In Java, a class is a blueprint or a template that defines the properties and behavior of an object.

An object is an instance of a class, and it has its own set of attributes (data) and methods (functions).

In the code above, Book is a class that defines three instance variables: title, author, and price. 
It also defines a method called getDetails that takes three parameters and prints out the details of the book.

In the main method, we create four objects of the Book class using the new keyword. 
Each object has its own set of attributes and methods.

We then call the getDetails method on each object, passing in different values for the title, author, and price.

Interview Questions and Answers:

Q1: What is the difference between a class and an object in Java?

A1: A class is a blueprint or a template that defines the properties and behavior of an object, while an object is an instance of a class that has its own set of attributes and methods.

Q2: What is the purpose of the new keyword in Java?

A2: The new keyword is used to create a new object of a class.

Q3: What is an instance variable in Java?

A3: An instance variable is a variable that is defined inside a class and is associated with each object of the class.

Q4: What is a method in Java?

A4: A method is a block of code that is defined inside a class and can be called multiple times from different parts of the program.

Q5: What is the difference between a parameter and an argument in Java?

A5: A parameter is a variable that is defined in a method signature, while an argument is the actual value that is passed to the method when it is called.

Q6: Can you explain the concept of encapsulation in Java?

A6: Encapsulation is the concept of bundling data and methods that operate on that data within a single unit, which is the class. This helps to hide the implementation details of the class from the outside world and provides a way to control access to the data.

Q7: How do you create multiple objects of the same class in Java?

A7: You can create multiple objects of the same class by using the new keyword multiple times, like this: Book book1 = new Book(); Book book2 = new Book();
 */

 class Book {
    String title;
    String author;
    double price;

    void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class Class_Q1 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Effective Java";
        book1.author = "Joshua Bloch";
        book1.price = 45.50;
        book1.getDetails();

        Book book2 = new Book();
        book2.title = "Clean Code";
        book2.author = "Robert C. Martin";
        book2.price = 37.95;
        book2.getDetails();

        Book book3 = new Book();
        book3.title = "Java: The Complete Reference";
        book3.author = "Herbert Schildt";
        book3.price = 60.99;
        book3.getDetails();
    }
}


/* // Define a class called Book
class Book
{
    // Declare three instance variables: title, author, and price
    public String title;
    public String author;
    public int price;

    // Define a method called getDetails that takes three parameters: title, author, and price
    void getDetails(String title, String author, int price)
    {
        // Print out the details of the book
        System.out.println("Title of the Book: " + title);
        System.out.println("Author of the Book: " + author);
        System.out.println("Price of the Book: " + price);
    }
}

// Define a public class called Class_Q1
public class Class_Q1
{
    public static void main(String args[])
    {
        // Create four objects of the Book class
        Book book = new Book();
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        // Call the getDetails method on each object, passing in different values
        book.getDetails("Programming in Java", "James Gosling", 900);
        book1.getDetails("Coding in java", "james", 500);
        book2.getDetails("java", "bond", 800);
        book3.getDetails("java", "henry", 1000);
    }
}
    */