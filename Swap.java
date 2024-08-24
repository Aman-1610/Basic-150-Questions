/*
public class Swap 
{
    public static void main(String args[])    
    {
        int num1 = 9;
        int num2 = 10;
        System.out.println("Number before Swapping num1="+num1+", num2="+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("number after swapping: num1="+num1+", num2="+num2);
    }
}
*/
//#######################################################################################
//Approch 2nd
/* 
public class Swap
{
    public static void main (String args[])
    {
        int num1 = 9;
        int num2 = 10;
        System.out.println("Number before Swapping num1="+num1+", num2="+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("number after swapping: num1="+num1+", num2="+num2);
    }
}
*/
//###########################################################################################
//Approach 3rd
/* 
public class Swap
{
    public static void main(String args[])
    {
        int num1 = 9;
        int num2 = 10;
        System.out.println("Number before Swapping num1="+num1+", num2="+num2);
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("number after swapping: num1="+num1+", num2="+num2);
    }
}
*/
//##############################################################################################
//Aproach 4th
public class Swap
{
    public static void main(String args[])
    {
        int num1 = 9;
        int num2 = 10;
        System.out.println("Number before Swapping num1="+num1+", num2="+num2);
        num1 =(num1+num2)-(num2=num1);
        System.out.println("number after swapping: num1="+num1+", num2="+num2);
    }
}