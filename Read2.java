//In the last lecture we have learnt about how to take input from the user with the healp of Scanner class and Standard input output Stream
// In this lecture we will be learning how to take input from the user with the help of different outputs
//There are five ways of tking input from the user:
//1. Using Scanner class
//2. Using BufferedReader class
//3. Using Console class
//4. Using Command line argument
//############################################################################################################################################
//Since we have learnt about the Scanner class in last lecture than we will be just using them without any explanation if you want to know about them than you can go through the last lecture
//let's import the Scanner class
/*import java.util.Scanner;
public class Read2 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String str = sc.nextLine();
        System.out.println("My name is "+str);
    }    
}*/
//##################################################################################################################################################
//2. By using BufferedReader
//It is a simple class which is used to read a sequence of characters
//This method is used by wrapping the System.in (standard input stream) in an InputStreamReader which is wrapped in a BufferedReader, we can read input from the user in the command line. 
//Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Read2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        //creating the obj named read of the BufferedReader class and passing the InputStreamReader class as a parameter
        System.out.print("Enter your name: ");
        //printing the String that tell's the user so that he/she may know what to enter
        String name = read.readLine();
        //Here readLine is a meathod of bufferedReader class which helps in reading the value from user
        System.out.println("My name is "+name);
        //Printing the value entered by the user
        //let's see the different methods of BufferedReader class
        //1. read(): Reads a single character;
        //2. readLine(): Reads a line or text.;
        //3. read(char cbuf[], int off, int Len): Reads characters into a portion of an array;
        //Now let's learn about different dattypes in Bufferedreader
        System.out.print("Enter the Integer value: ");
        int n = Integer.parseInt(read.readLine());
        System.out.println("the value entered by the user: "+n);
        System.out.print("Enter the Decimal value: ");
        float f=Float.parseFloat(read.readLine());
        System.out.println("Thedecimal value entered by the user is : "+f);
        //Note: To read other types, we use functions like Integer.parseInt(), Double.parseDouble(). To read multiple values, we use split().
    }
}*/
//##############################################################################################################################################
//3. By using Console class
/*It has been becoming a preferred way for reading user’s input from the command line. 
In addition, it can be used for reading password-like input without echoing the characters entered by the user; the format string syntax can also be used (like System.out.printf()). 

Advantages:

Reading password without echoing the entered characters.
Reading methods are synchronized.
Format string syntax can be used.
Does not work in non-interactive environment (such as in an IDE).
*/

public class Read2 {
    public static void main(String args[]) {
        char[] pass;
        System.out.print("Enter your name: ");
        String name = System.console().readLine();
        System.out.println("My name is " + name);
        pass = System.console().readPassword("Enter your password: ");
        System.out.println("My password is " + new String(pass));
    }
}

//################################################################################################################
//4. By using Command line arguments
/*Most used user input for competitive coding. 
The command-line arguments are stored in the String format. 
The parseInt method of the Integer class converts string argument into Integer. 
Similarly, for float and others during execution. 
The usage of args[] comes into existence in this input form. 
The passing of information takes place during the program run. 
The command line is given to args[].
 These programs have to be run on cmd. */
 /* 
class Read2
{
    public static void main(String args[])
    {
        System.out.println("My name is "+args[0]);
        System.out.println("I am "+args[1]+" years old.");
        System.out.println("My Enrollment number is "+args[2]);
    }
}*/