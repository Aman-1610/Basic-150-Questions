/* Write a java program to divide two numbers and print them on the screen. */

import java.util.Scanner;
public class Question3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        
        float divide=(float)num1/num2;
        System.out.println("Division of "+num1+" and "+num2+" is: "+divide);
    }
}