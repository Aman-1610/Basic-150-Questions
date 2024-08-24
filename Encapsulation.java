/*
 * Theory:

Encapsulation: Encapsulation is a fundamental concept in object-oriented programming (OOP) that binds together the data and the methods that manipulate that data, and keeps both safe from outside interference and misuse. 
In the code, the Account class encapsulates the balance field and provides methods to manipulate it, ensuring that the balance is always valid and consistent.

Data Hiding: Data hiding is a key aspect of encapsulation that ensures that the internal state of an object (in this case, the balance field) is not directly accessible from outside the object. 
Instead, the object provides methods to interact with its internal state, which helps to maintain data integrity and consistency.

Abstraction: Abstraction is another OOP concept that is related to encapsulation. Abstraction involves showing only the necessary information to the outside world while hiding the internal implementation details. 
In the code, the Account class provides an abstract interface to the outside world through its methods, without revealing the internal implementation details of how the balance is stored and manipulated.

Interview Questions with Answers:

What is encapsulation, and how is it achieved in the given code?
Answer: Encapsulation is the concept of bundling data and methods that operate on that data within a single unit, making it harder for other parts of the program to access or modify the data directly. 
In the given code, encapsulation is achieved by declaring the balance field as private and providing public methods (deposit, withdraw, and getbalance) to manipulate and access the balance.

What is the purpose of the deposit method in the Account class?
Answer: The deposit method is used to add a specified amount to the account balance, but only if the amount is positive.

What is the purpose of the withdraw method in the Account class?
Answer: The withdraw method is used to subtract a specified amount from the account balance, but only if the amount is positive and does not exceed the current balance.

What is the purpose of the getbalance method in the Account class?
Answer: The getbalance method is used to retrieve the current balance of the account.

Why is the balance field declared as private in the Account class?
Answer: The balance field is declared as private to ensure that it is not directly accessible from outside the Account class, which helps to maintain data integrity and consistency.

What would happen if the balance field were declared as public instead of private?
Answer: If the balance field were declared as public, it would be directly accessible from outside the Account class, which could lead to data corruption or inconsistency. 
For example, someone could directly modify the balance without going through the deposit or withdraw methods, which could result in an invalid or inconsistent state.

How does the Account class ensure data integrity and consistency?
Answer: The Account class ensures data integrity and consistency by encapsulating the balance field and providing controlled access to it through the deposit, withdraw, and getbalance methods. 
These methods ensure that the balance is always valid and consistent, and prevent direct modification of the balance from outside the class.
 */

// This is a simple example of encapsulation in Java

class Account 
{
    private double balance; // This is the private field that stores the account balance
    public void deposit(double amount) // This method adds a specified amount to the account balance
    {
        if(amount>0) // Check if the amount is positive
        {
            balance += amount; // Add the amount to the balance
        }
    }
    public void withdraw(double amount) // This method subtracts a specified amount from the account balance
    {
        if(amount>0&&amount<=balance) // Check if the amount is positive and does not exceed the current balance
        {
            balance -= amount; // Subtract the amount from the balance
        }
    }
    public double getbalance() // This method returns the current account balance
    {
        return balance; // Return the balance
    }
}
public class Encapsulation 
{
    public static void main(String args[])
    {
        Account myAccount = new Account(); // Create a new account object
        myAccount.deposit(1000); // Deposit 1000 into the account
        myAccount.withdraw(200); // Withdraw 200 from the account
        System.out.println("Current Balance: "+myAccount.getbalance()); // Print the current balance
    }
}