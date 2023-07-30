package punartha_sirhomework;
//) Accept a string and a character. Check out whether the character is present in the string or not. If present display its position(s) and frequencies
import java.util.*;
class findchar 
{
    public static void main ()
    {
        String n;char ch,ch1;int f=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        n=sc.nextLine();
        System.out.println("Enter a character to be searched");
        
        ch1=sc.next().charAt(0);
        for(i=0;i<n.length();i++)
        {
            ch=n.charAt(i);
            if(ch==ch1)
            f++;
        }
        if(f>0)
        System.out.println("String is found and its frequency is "+f);
        else
        System.out.println("String not found");
    }
}