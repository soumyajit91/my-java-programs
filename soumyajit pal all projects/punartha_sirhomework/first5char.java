package punartha_sirhomework;
//Accept a string and display its 1st 5 characters.
import java.util.*;
class first5char 
{
    public static void main ()
    {
        String n;int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string whoes first 5 characters will be displayed ");
        n=sc.nextLine();
        System.out.println("the characters are");
        for(i=0;i<5;i++)
        System.out.print(n.charAt(i));
    }
}