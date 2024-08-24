public class AddBinary 
{
    public static void main(String ARGS[])    
    {
        String num1 = "0110";
        String num2 = "1000";
        int n = Integer.parseInt(num1,2);
        int n1 = Integer.parseInt(num2,2);
        int sum= n+n1;
        System.out.println("Sum of binary number is "+sum);
    }
}
