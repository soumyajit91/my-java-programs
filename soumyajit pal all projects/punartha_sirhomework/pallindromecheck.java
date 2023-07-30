package punartha_sirhomework;
// Accept a string and check out whether the string is palindrome or not.
import java.util.*;
class pallindromecheck
{
    public static void main ()
    {
        String n,t="";int i,c=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string which will be checked if pallindrome or not ");
        n=sc.nextLine();
        for(i=n.length()-1;i>=0;i--)
        {
            t=t+n.charAt(i);
        }
        if(n.equals(t))
        System.out.println("palindrome ");
        else 
        System.out.println("not pallindrome");
    }
}