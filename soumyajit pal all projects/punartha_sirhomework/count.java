package punartha_sirhomework;
//Accept a string and count the number of words.
import java.util.*;
class count
{
    public static void main ()
    {
        String n;int i,w=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string which will be stored in a array ");
        n=sc.nextLine()+" ";
         for(i=0;i<n.length()-1;i++)
         {
             if(n.charAt(i)==' ')
             {
             w++;
             if(n.charAt(i+1)==' ')
             w--;
            }
        }
        w++;
         System.out.println("the no. of words are"+w);
        }
    }