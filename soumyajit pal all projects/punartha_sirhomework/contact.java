package punartha_sirhomework;
//Accept two strings and concatenate them into another string
import java.util.*;
class contact
{
    public static void main ()
    {
        String n,t,t1;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the first string");
        n=sc.nextLine();
        System.out.println("Enter the second string");
        t=sc.nextLine();
        t1=n+t;
        System.out.println("the added string is "+t1);
    }
}