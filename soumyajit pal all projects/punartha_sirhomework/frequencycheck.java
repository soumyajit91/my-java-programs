package punartha_sirhomework;
import java.util.*;
class frequencycheck
{
    public static void main()
    {  
        String n;char str[]=new char[100];int k=0,i,j,c=1,arr[]=new int[100];char ch=' ';
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER a string whose frequency needs to be checked");
        n=sc.nextLine();
        for( j=1;j<n.length();j++)
        {
            for( i=j;i<n.length();i++)
            {
                ch=n.charAt(k);
                if((int)ch==n.charAt(i))
                    c++;
                  }
            k++;      
            str[j]=ch;
            arr[j]=c;
            c=1;            
        }
         for( j=1;j<n.length();j++)
        {
            int d=0;
            for( i=1;i<n.length();i++)
            {
                
                if(str[j]==str[i])
                {
                    d++;
                }
                if(d==1)
                {
                    System.out.print("the letter is   "+str[i]);
                    System.out.println("  the frequency is"+arr[i]);
                }
                
            }
        }
    }
}