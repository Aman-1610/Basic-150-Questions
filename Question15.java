import java.util.*;
class Question15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("Enetr the 3 X 3 matrix: ");
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }
        System.out.println("The entered matrix are: ");
       // for(int row=0;row<arr.length;row++)
        //{
         //   for(int col=0;col<arr[row].length;col++)
          //  {
            //    System.out.print(arr[row][col]+" ");
           // }
           // System.out.println("");
       // }

       //other way to print array

       //for(int row=0;row<arr.length;row++)
       // {
       //  System.out.println(Arrays.toString(arr[row]));
       // }

       //one more way
       
       for(int[] a:arr)
       {
           System.out.println(Arrays.toString(a));
       }
    }
}