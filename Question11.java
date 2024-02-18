/* 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */

import java.util.Scanner;

public class Question11 
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double rad=sc.nextDouble();
        double area=(3.14*(rad*rad));
        double perimeter=2*(3.14*rad);
        System.out.println("Area is= "+area);
        System.out.println("Perimeter is= "+perimeter);
    }
}
