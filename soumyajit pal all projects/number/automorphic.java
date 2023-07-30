
             package number;
import java.util.*;
class Automorphic 
   {
     int digits(int a)
     {
         int c=0,k=0;
         while(a!=0)
           {
             k=a/10;
             c=c+1;
             a=k;
            }
         return(c);
        }
     public static void main()
     {
         int m,n,b,r,p;
         double d=0;
         Scanner sc=new Scanner(System.in);
         Automorphic ob=new Automorphic();
         System.out.println("Enter a number");
         n=sc.nextInt();
         m=n;
         p=m*m;
         b=ob.digits(n);
         d=Math.pow(10,b);
         r=p%(int)d;
         if(m==r)
         System.out.println(m+"is an automorphic Number");
         else
         System.out.println(m+"is not an automorphic Number");         
        }
    }
         
         
         