package string;

import java.util.*;
class oddcheck
   {
       public static void main()
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("enter a paragraph seperated by fullstop/question mark/'!' mark");
           String kr= sc.nextLine();
           int k=kr.length();String fr="";
           int i =0,a=0;
           String set;
           int max=0,r=0,u=0,d=0;
           for(i=0;i<k;i++)
           {
               char c= kr.charAt(i); 
                 
                 if(c==' ')
                 {
                     r++;
                    }
               if(c=='.'||c=='?'||c=='!')
               {
                   a++;
                   set = kr.substring(d,i);                                     
                   if(r%2!=0)
                   {
                    fr = kr.substring(d,i);
                    System.out.println(" sentence  "+ a+" has odd numberof words which is  "+fr);                     
                   
                     }
                   d=i;
                   r=0;
                }
               else if(a>5)
               {
                   System.out.println("wrong input");
                   break;                  
                }
            }
           
        }
    }
           
           
           