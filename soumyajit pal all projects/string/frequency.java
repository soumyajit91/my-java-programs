package string;
import java.util.*;
class frequency
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a word to check frequency");
        String str = sc.nextLine();
        int k= str.length();int r=1,m=0;
       String my_str[]=new String[m]; 
       String word="" ;
       for(int i=0;i<k;i++)
           {                
               char c=str.charAt(i);
               if( c==' ')
               {
                   m++;
                   my_str[r]=word;                
                   word="";                   
                }
                word=word+c;
            }
           String repeat[]= new String[k]; 
          int g=0;
        for (int i=0 ;i<k; i++)     
        {
            for (int j=0;j<k;j++)
            {                          
            if(my_str[i]==my_str[j])
            {
            r++;
            repeat[g]=my_str[i];
         } 
        }
        
         System.out.println(i + "is present "+r +" times");
         r=0;
        }
    }
}