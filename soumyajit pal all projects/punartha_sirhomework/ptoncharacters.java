package punartha_sirhomework;
//Accept a string and display "n" characters of the string from the position "p"
import java.util.*;
class ptoncharacters
{
    public static void main ()
    {
        String n;int i,p,t;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string whoes last 5 characters from 3rd position will be displayed ");
        n=sc.nextLine();
        System.out.println("Enter the position from which strings will be printed ");
        p=sc.nextInt();
        System.out.println("Enter the no. of characters u want to display");
        t=sc.nextInt();
        System.out.println("the characters are");
        for(i=p;i<p+t;i++)
        System.out.print(n.charAt(i));
    }
}