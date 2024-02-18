/* Write a java program to print the sum of two numbers. */
import java.util.Scanner;
public class Question2 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System .out.print("Enter the First number: ");
        int num1=sc.nextInt();
      
        System.out.print("ENter the second number: ");
        int num2= sc.nextInt();

        int sum=num1+num2;
        
        System.out.println("Sum is: "+sum);
    }
}
