package string;
import  java.io.*;
import java.util.*;
class altswap1
{
    static void alternaterev(String st)
    {
        st=st+" ";
        String word=" ",sentence=" ";
        for (int n=0;n<st.length();n++)
        {
            char ch=st.charAt(n);int k=0;
            if(ch!=' ')
            {
                word=word+ch;
                k++;
            }
            else
            {
                int l =word.length();
                char ch1=word.charAt(0),ch2=word.charAt(l-1);
                String rev =ch2+word.substring(1,l-1)+ch1;                
                sentence=sentence+rev;
                k=0;
                word=" ";
            }
        }
        System.out.println(sentence);
    }
    public static void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter a paragraph were each sentence is seperated by '.''?'''1'");
        String para=sc.nextLine();  
        para=para+" ";
        StringTokenizer st = new StringTokenizer(para);
        char let=' ';int n=0,x=0,max=0,f=0,l=0,d=1;
        String sent=" ",pr=" ";      
        altswap1 ob= new altswap1();
        while(st.hasMoreTokens())
        {
                 sent=st.nextToken(".");
                if(d%2!=0)
                
                ob.alternaterev(sent);
                System.out.println(sent);
                d++;
                String str=pr;
                int m=str.length();
                if(max<m)
                {
                    max=m;                    
                }                
                pr="";                                                                                     
    }          
     System.out.println("The largest paragraph is:   "+sent);
    }
}
