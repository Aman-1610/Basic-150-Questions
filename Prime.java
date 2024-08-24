import java.util.Scanner;
public class Prime 
{
    public static void main(String args[])    
    {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number for checking weather the given number is true or false: ");
       int n=sc.nextInt();
       isPrime(n);
       System.out.print(n+"is prime number "+isPrime(n));
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while (c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return c*c>n;

    }
}
