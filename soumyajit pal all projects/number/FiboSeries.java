package number;

import java.util.*;
class FiboSeries
{
    int a, b;
    FiboSeries()
    {
        a=0;
        b=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower and upper range");
         a=sc.nextInt();
         b=sc.nextInt();
        }
     int isprime(int n)
     {
         int c=0;
         for(int i=1;i<=n;i++)
         {
             if(n%i==0)
             c++;
            }
         return c;
        }
     void fibonacci()
     {
         int k=1,c=0,r=1;
         FiboSeries ob=new FiboSeries();
         
         int i=2;
         while(c<b)
         {
             c=k+r;
            
            
            if(c>a)
            {
                int l=ob.isprime(c);
                if(l==2)
                System.out.println(c);
            }
             k=r;
             r=c;
            i++;
        }
    }
    public static void main()
    {
    FiboSeries ob=new FiboSeries();
    ob.accept();
    ob.fibonacci();
}
}

    