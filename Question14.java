import java.util.*;
class Question14
{
    public static void main(String args[])
    {
        sum();
    }
    static void sum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
    }
}