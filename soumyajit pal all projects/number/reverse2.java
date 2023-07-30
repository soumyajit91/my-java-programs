package number;


import java.util.*;
class reverse2
 {
     
      int rev(int n)
     {
         int r=0,b;
         while(n>0)
         {
             b=n%10;
             r=r*10+b;
             n=n/10;
            }
         return r;
        }
     public static void main()
       {
         int i,n,t;
         Scanner sc=new Scanner(System.in);
         reverse2 ob=new reverse2();
         System.out.println("Enter the no. of numbers that need to be reversed");
         t=sc.nextInt();
         for( i=0;i<t;i++)
           {
               System.out.println("enter number");
               n=sc.nextInt();
               System.out.println("the reverse number is"+ob.rev(n));
            }
        }
    }     