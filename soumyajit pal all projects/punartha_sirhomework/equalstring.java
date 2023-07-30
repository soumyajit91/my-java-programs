package punartha_sirhomework;
//Accept two strings and check out whether both the strings are same or not.
import java.util.*;
class equalstring
{
    public static void main ()
    {
        String n,n1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string to be checked if equal or not");
        n=sc.nextLine();
        System.out.println("Enter the second string to checked if equal or not");
        n1=sc.nextLine();
        if(n.equals(n1))
            System.out.println("Equal strings");
        else
            System.out.println("not Equal strings");
    }
}