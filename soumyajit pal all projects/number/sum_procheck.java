package number;


import java.util.*;
class sum_procheck
 {
     public static void main()
     {
         int n,i,s=0,p=1;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a no.");
         n=sc.nextInt();
         for(i=1;i<n;i++)
         {
             s+=i;
             p*=i;
            }
         if(p%s==0)          
             System.out.println("true");
         else
             System.out.println("false");
            }
        }
        
             
  