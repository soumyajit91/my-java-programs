package punartha_sirhomework;
//Accept a string and display its 1st 5 characters in reverse order
import java.util.*;
class first5charrev 
{
    public static void main ()
    {
        String n;int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string whoes first 5 characters will be displayed in rev ");
        n=sc.nextLine();
        System.out.println("the characters are");
        for(i=4;i>=0;i--)
        System.out.print(n.charAt(i));
    }
}