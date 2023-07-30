package string;
import java.util.*;
public class test
{
public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a paragraph were each sentence is seperated by '.''?'''1'");
        String para=sc.nextLine();  
        para=para+" ";
        char let=' ';int n,x=0,max=0,f=0,l=0,d=1;
        String sent=" ";
       String str="";
        for (n=0;n<para.length();n++)
        {
            if(let=='?'||let=='!'||let=='.')
            {
               
                System.out.println(para.substring(x,n));
                d++;
                str=para.substring(x,n);
                int m=str.length();
                if(max<m)
                {
                    max=m;
                    f=x;l=n;
                }                
                x=n;
                
            } 
            else
            {
                let=para.charAt(n);
                
        }
    }
        System.out.println("The largest paragraph is:   "+para.substring(f,l));
    }
}
