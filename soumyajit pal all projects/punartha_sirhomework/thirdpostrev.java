package punartha_sirhomework;
//Accept a string and display 5 characters from its 3rd position, in reverse order.
import java.util.*;
class thirdpostrev
{
    public static void main ()
    {
        String n;int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string whoes  characters from 3rd position will be displayed in rev");
        n=sc.nextLine();
        System.out.println("the characters are");
        for(i=6;i<=2;i--)
        System.out.print(n.charAt(i));
    }
}