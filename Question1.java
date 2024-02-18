/* Write a java program to print "hello" on screen and your name on a separate line. */
/*import java.io.*;

class Question1
{
    public static void main (String args[])
    {
        System.out.println("Hello\nAman kumar");
    }
}*/

/* ################################################################################################### */

import java.util.Scanner;
class Question1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the full name: ");
        String fName = sc.nextLine();
        System.out.println(" ");
        System.out.println("Hello\n"+fName);
    }
}