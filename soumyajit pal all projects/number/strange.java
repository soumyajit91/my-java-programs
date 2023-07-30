package number;
import java.util.*;
class strange
  {
       int prime (int a)
    {
        int c=0;
        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
            c++;
            
    }
    return c;
  }
   int count( int n)
   {
       int r=0,d=0;
         while(n>0)
         {
             int b=n%10;
             d++;
             n=n/10;
            }
            return d;
        }
      int rev(int n)
     {
         int r=0;
         while(n>0)
         {
             int b=n%10;
             r=r*10+b;
             n=n/10;
            }
         return r;
        } 
        void display(int n)
        {
            strange ob=new strange();
             int r=0,d=0;
             System.out.println("no. in prime position");
            int k=6;
         while(n>0)
         {
             int b=n%10;
             
             if(ob.prime(k)==1)
             {
                 System.out.println(b);
                }
                k--; 
             n=n/10;
            }
            
        }
            
  public static void main()
  {
      strange ob=new strange();
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter a six digit no.");
      int n=sc.nextInt();
      if(ob.count(n)==6)
      {
         System.out.println("enter a digit from 1 to 5");
         int d=sc.nextInt();
         if(d>=1&&d<=5)
         {
             int f=n/(int)Math.pow(10,6-d);
             int l=n%(int)Math.pow(10,(6-d));
             int r=ob.rev(f);
             System.out.println(r);
             int g=ob.rev(l);
             System.out.println(g);
             int k=(r*(int)Math.pow(10,(6-d)))+g;
             System.out.println(k);
             ob.display(k);
            }
        }
    }
}
      
  
  
  
  
