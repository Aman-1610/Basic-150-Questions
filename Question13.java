/* 13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */

import java.util.*;
class Question13
{
    public static void main(String ats[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        float w=sc.nextFloat();
        System.out.print("Enter the height of the rectangle: ");
        float h=sc.nextFloat();
        //calculate area
        Float area = w*h;
        //calculate perimeter
        Float perimeter = 2*(w+h);
        System.out.println("Area of the rectangle: "+area);
        System.out.println("Perimeter of the rectangle: "+perimeter);
    }
}