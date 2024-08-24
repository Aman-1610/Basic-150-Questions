import java.io.*;
import java.util.Scanner;
public class Read {
    //Let's learn about how we read the value entered by the user and then print the value entered by the user
    public static void main(String args[])
    {
      //for reading the value from the user we create the object of the Scanner class
      //Scanner class has a predefined methods like nextInt(), nextFloat(), nextDouble(), nextChar(), etc
      //So let's first create the object of the Scanner class
      Scanner sc = new Scanner(System.in);
      //Here, sc is the object name of the Scanner class created with the help of new keyword 
      //new keyword is used to create the object of the class
      //System.in is a standard input stream that helps in taking the value from the user
      //Now, lets take the input from the user
      //first off all we need to print a message that will tell the user to enter the value of which type
      System.out.print("Enter an Integer Value: ");
      //Here, System.out is a standard output Stream that helps in displaying the message on the output screen
      //Now, lets take the value from the user and stror it in the variable
      int a = sc.nextInt();
      //Here int is a datatype in java for storing integer value there are many different datatypes like char for storing character, float for storing the decimal numbers, String for storing the group of characters, etc..
      //a is the variable name in which we are storing the value enetered by the user
      //Now, with the help of the object sc we can call the methods of the Scanner class and we can read the value entered by the user and can store it in the variable
      //Now let us print the value entered by the user
      System.out.println("The value entered by the user is :"+a);
      //Lets, do the same for the other datatypes
      System.out.print("Enter the Decimal number: ");
      float f = sc.nextFloat();
      System.out.println("The decimal value entered by the user is : "+f);
      System.out.print("Enter the Character : ");
      char ch = sc.next().charAt(0);
      System.out.println("The character that has been entered by the user: "+ch);
      System.out.print("Enter your name: ");
      String str = sc.next();
      System.out.println(str+" is my name.");
    }
    
}
