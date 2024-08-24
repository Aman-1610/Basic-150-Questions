
import java.util.*;
public class Question18 
{
    public static void main(String a[])    
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements you are going to enter into an array: ");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        int arr2[] = new int[arr1.length];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i] = arr1[i];
        }
        //Displaying the elements of an array 
        System.out.println("Displaying the elemnts entered into an arr1: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nDisplaying the elemnts entered into an arr2: ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
