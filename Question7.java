/* 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */

import java.util.Scanner;
public class Question7 
{
    public static void main(String args[])   
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for obtaining its multiplication table: ");
        int num1=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int product = num1*i;
            System.out.println(num1+" X "+i+" = "+product);
        }
    }
}
