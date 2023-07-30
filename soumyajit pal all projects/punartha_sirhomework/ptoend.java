package punartha_sirhomework;
//Accept a string and display rest of the string from the position "p" to the end
import java.util.*;
class ptoend
{
    public static void main ()
    {
        String n;int i,p;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string whoes  characters from pth position will be displayed ");
        n=sc.nextLine();
        System.out.println("Enter the position from which strings will be printed ");
        p=sc.nextInt();
        System.out.println("the characters are");
        for(i=p;i<n.length();i++)
        System.out.print(n.charAt(i));
    }
}