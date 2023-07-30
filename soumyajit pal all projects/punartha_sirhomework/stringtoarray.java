package punartha_sirhomework;
//Accept a string and copy it into another array.
import java.util.*;
class stringtoarray
{
    public static void main ()
    {
        String n;int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string which will be stored in a array ");
        n=sc.nextLine();
        char arr[]=new char[n.length()];       
        for(i=0;i<n.length();i++)
        arr[i]=n.charAt(i);
        System.out.println("the array storing process complete it contains");
        for(i=0;i<n.length();i++)
        System.out.print(arr[i]);
    }
}