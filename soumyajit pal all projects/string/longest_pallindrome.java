package string;
import java.util.*;
class longest_pallindrome
{
    int isPal(String s)
    {   
        if(s.length() == 0 || s.length() == 1)
        {
            return 1; 
        }

        if(s.charAt(0) == s.charAt(s.length()-1))
        {
            return isPal(s.substring(1, s.length()-1));
        }
        return 0;
    }

    public  void main()
    {
        char ch;int i,k=0;String word="";String arr[]=new String[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence to find longest pallindrome");
        String n=sc.nextLine()+" ";
        for(i=0;i<n.length();i++)
        {
            ch=n.charAt(i);
            if(ch==' ')
            {
                if(isPal(word)==1)
                {
                    arr[k]=word;
                    k++;
                }
            }
            else
                word=word+ch;
        }
        int max=arr[0].length();
        int pos=0;
        for(i=0;i<arr.length;i++)
        {
            if(max<arr[i].length())
            {
                max=arr[i].length();
                pos=i;
            }
        }
        System.out.println("The largest pallindromic word  is"+arr[pos]);
    }
}