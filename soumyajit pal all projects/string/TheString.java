package string;
import java.util.*;
class TheString
{
    int i=0;
    String str;
    int len,wordcount,cons;
    TheString()
    {
        
        len=0;
        wordcount=0;
        cons=0;
    }
    TheString(String ds)
    {
       str=ds;
    }
    void CountFreq()
    {
        StringTokenizer data=new StringTokenizer(str);
        len=str.length();
        int vowels=0;
        
        wordcount=data.countTokens();
        if(len<100)
        {
        for(int i=0;i<len;i++)
        {
            char k=str.charAt(i);
            if((k=='a'||k=='i'||k=='o'||k=='u'||k=='A'||k=='E'||k=='I'||k=='O'||k=='U'))
            vowels++;
            else
            cons++;
            
        }
    }
   }
    void Display()
    {
        System.out.println("The sentence is :- "+str);
        System.out.println("The no. of words are :-  "+wordcount);
        System.out.println("the no. of consonant are :- "+cons);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String drs=sc.nextLine();
        TheString ob=new TheString(drs);
        ob.CountFreq();
        ob.Display();
    }
}
             
                