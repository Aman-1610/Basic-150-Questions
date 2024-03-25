import java.util.*;
public class Question12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int sub=sc.nextInt();
        System.out.print("\nEnter the marks of the subject: ");
        int marks[]=new int[sub];
        for(int i=0;i<sub;i++)
        {
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<sub;i++)
        {
            sum+=marks[i];
        }
        int avg=sum/sub;
        System.out.println("The average of the marks: "+avg);
    }
}