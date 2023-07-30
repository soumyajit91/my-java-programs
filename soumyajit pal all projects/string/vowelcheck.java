package string;


import java.util.*;
class vowelcheck
   {
       public static void main()
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("enter a paragraph seperated by fullstop/question mark/'!' mark");
           String kr= sc.nextLine();
           int k=kr.length();String fr="";
           int i =0,a=0;
           String set="",word="",rest="";
           int max=0,r=0,u=0,d=0;                                                     
             if(kr.charAt(k-1)!='.'||kr.charAt(k-1)!='?'||kr.charAt(k-1)!='!'||kr.charAt(k-1)!=' ')
               {
                System.out.println("invalid sentence");   
                                                                                  
                    }
                    else
                    {   
           for(i=0;i<k;i++)
           {
               char c= kr.charAt(i); 
                 word=word+c;
                  r++;  
              
               if(c==' ')
               {      
                 
                     
                   if((word.charAt(0)=='a'||word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u')&&(word.charAt(r-1)=='a'||word.charAt(r-1)=='e'||word.charAt(r-1)=='i'||word.charAt(r-1)=='o'||word.charAt(r-1)=='u') )
                   {
                       max++;
                       set=set+word+" ";
                     }
                     else
                     {
                         rest=rest+word+" ";
                        }
                   word="";
                   r=0;
             
                }

            }
                 System.out.println(" the number of words beginning and ending with vowel"+max);
                 System.out.println(set+ rest);
    
          }

}
}