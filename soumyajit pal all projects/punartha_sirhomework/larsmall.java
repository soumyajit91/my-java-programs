package punartha_sirhomework;
//Accept few strings and display the largest and smallest strings.
import java.util.*;
class larsmall
{
    public static void main()
    {
        String n,word="",max1="",word1="",min="";int min1=0 ,i,d=0,max=0;char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        n=sc.nextLine();

        for(i=0;i<n.length();i++)
        {
            ch=n.charAt(i);
            if(ch!=' '&&d==0)                  
                word=word+ch;
            else if(ch==' '&&d==0)
            {
                min=word;
                min1=word.length();
                word="";
                d++;
            }
                                   
            if(ch!=' ')                  
                word1=word1+ch;
            else
            {
                if(word1.length()>max)
                {
                    max=word1.length();
                    max1=word1;
                }
                if(word1.length()<min1)
                {
                    min=word1;
                    min1=n.length(); 
                } 
                word1="";
            }
        }
        System.out.println("the smallest string is"+min);
        System.out.println("the largest string is"+max1);
    }
}
