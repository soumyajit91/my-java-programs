package punartha_sirhomework;
//Accept a string and copy it into another array in reverse order
import java.util.*;
class stringtoarrayrev
{
    public static void main ()
    {
        String n;int i;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string which will be stored in a array ");
        n=sc.nextLine();
        char arr[]=new char[n.length()];       
        for(i=0;i<n.length();i++)
        arr[i]=n.charAt(n.length()-i-1);
        System.out.println("the array storing process complete it contains");
        for(i=0;i<n.length();i++)
        System.out.print(arr[i]);
    }
}