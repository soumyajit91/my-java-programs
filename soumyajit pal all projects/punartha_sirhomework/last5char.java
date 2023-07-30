package punartha_sirhomework;
//Accept a string and display its last 5 characters.
import java.util.*;
class last5char
{
    public static void main ()
    {
        String n;int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string whoes last 5 characters will be displayed ");
        n=sc.nextLine();
        System.out.println("the characters are");
        for(i=n.length()-5;i<n.length();i++)
        System.out.print(n.charAt(i));
    }
}