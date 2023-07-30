package string;
import java.util.*;
class check
   {
       public static void main()
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("enter a paragraph seperated by fullstop");
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
                   System.out.println(a + "th statement is    "+ set); 
                   
                   if(max<r)
                   {
                   max=r;
                   r=0;
                   u=a;
                   fr = kr.substring(d,i);
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
           System.out.println("the largest sentence is no. "+ u +" which is  :-"+fr);
        }
    }
           
           
           