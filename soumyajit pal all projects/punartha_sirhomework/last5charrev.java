package punartha_sirhomework;
//Accept a string and display its last 5 characters in reverse order
import java.util.*;
class last5charrev 
{
    public static void main ()
    {
        String n;int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string whoes last 5 characters will be displayed in rev ");
        n=sc.nextLine();
        System.out.println("the characters are");
        for(i=n.length()-1;i>n.length()-6;i--)
        System.out.print(n.charAt(i));
    }
}