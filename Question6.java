/* 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5 */

import java.util.Scanner;
public class Question6 {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Eneter the second number: ");
        int num2=sc.nextInt();
        System.out.println("Sum of "+num1+" + "+num2+" = "+(num1+num2));
        System.out.println("Subtraction of "+num1+" - "+num2+" is "+(num1-num2));
        System.out.println("Multiplication of "+num1+" * "+num2+" is "+(num1*num2));
        System.out.println("Division of "+num1+" / "+num2+" is "+(num1/num2));
        System.out.println("Modulus of "+num1+" % "+num2+" is "+(num1%num2));
    }
    
}
