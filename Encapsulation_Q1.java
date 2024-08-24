/*
 * Theory:

Encapsulation is a fundamental concept in object-oriented programming (OOP) that binds together the data and the methods that manipulate that data. 
It helps to hide the internal implementation details of an object from the outside world and provides a controlled access to the data through public methods.

In this example, the BankAccount class encapsulates the account number, account holder name, and balance. The constructor initializes the account number, account holder name, and balance. 
The deposit and withdraw methods modify the balance, and the displayAccountInfo method displays the account information.

Interview Questions and Answers:

What is encapsulation in OOP?
Answer: Encapsulation is a concept in OOP that binds together the data and the methods that manipulate that data, hiding the internal implementation details from the outside world.

What are the benefits of encapsulation?
Answer: Encapsulation provides data hiding, code reusability, and improved security by controlling access to the data through public methods.

Can you explain the concept of encapsulation with an example?
Answer: (Use the BankAccount class as an example) In the BankAccount class, the account number, account holder name, and balance are encapsulated. 
The constructor initializes the data, and the deposit and withdraw methods modify the balance. The displayAccountInfo method displays the account information.

Why is encapsulation important in software development?
Answer: Encapsulation is important because it helps to hide the internal implementation details of an object, making it easier to modify or extend the code without affecting other parts of the program. 
It also improves code reusability and security.

How does encapsulation relate to abstraction?
Answer: Encapsulation is a way to achieve abstraction, which is the concept of showing only the necessary information to the outside world while hiding the internal implementation details. 
Encapsulation helps to abstract the data and behavior of an object, making it easier to work with and modify.
 */

class BankAccount
{
    // Private instance variables to store the account number, account holder name, and balance.
    private double balance;
    private String accountNumber;
    private String accountHolderName;

    // Constructor to initialize the account number, account holder name, and balance.
    public BankAccount(String accountNumber, String accountHolderName)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // Method to deposit money into the account.
    public void deposit(double amount)
    {
        // Check if the deposit amount is positive.
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else
        {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Method to withdraw money from the account.
    public void withdraw(double amount)
    {
        // Check if the withdrawal amount is positive and does not exceed the balance.
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display the account information.
    public void displayAccountInfo()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class Encapsulation_Q1 
{
    public static void main(String args[])   
    {
        // Create a new BankAccount object with account number and account holder name.
        BankAccount account = new BankAccount("123456789", "Aman");

        // Deposit money into the account.
        account.deposit(2000);

        // Withdraw money from the account.
        account.withdraw(500);

        // Display the account information.
        account.displayAccountInfo();
    }
}