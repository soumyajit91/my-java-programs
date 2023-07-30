package others;

import java.util.*;
class community
   {
       public static void main()
       {
           int f=0,a=0,n=0,in=0,i,d=0;
           Scanner sc=new Scanner(System.in);
           for(i=0;i<50;i++)
           {
               System.out.println("person"+(i+1)+" If u favour the policy, he enter 1, if u are against the policy enter 2 or if u have no opinion then enter 0");
               d=sc.nextInt();
               if(d==0)
               n++;
               else if(d==1)
               a++;
               else if(d==2)
               f++;
               else
               in++;
            }
            
            System.out.println("people for this policy "+f);
            System.out.println("people against this policy"+a);
            System.out.println("people with no opinion"+n);
            System.out.println("invalid votes"+in);
        }
    }