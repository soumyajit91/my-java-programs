




package number ;
import java .util.*;
class isbn
 {
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         System.out.println("Enter a ten digit number");
         long p=sc.nextLong();
        long  n=p,c=0;
         while(n>0)
         {
             c++;
             n=n/10;
            }
         long k=10;
         
        long s=0;
        if(c==10)
       {
            System.out.println("10 didgit no.");
             while(p>0)
         {
            long b=p%10;
            s=s+(b*k);
            k--;
            p=p/10;
        }
        System.out.println(s);
            if(s%11==0)
            
                System.out.println("Isbn no.");
                else
                System.out.println("not isbn no.");
            }
        }
    }