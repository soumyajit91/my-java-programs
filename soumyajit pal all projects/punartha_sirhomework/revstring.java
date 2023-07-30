package punartha_sirhomework;
//Accept a string and display it in reverse order
import java.util.*;
class revstring 
{
    public static void main ()
    {
        String n,word="";int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to be reversed");
        n=sc.nextLine();
        for(i=(n.length()-1);i>=0;i--)
        {            
            word=word+n.charAt(i);
        }
        System.out.println("the reversed word is "+word);
    }
}