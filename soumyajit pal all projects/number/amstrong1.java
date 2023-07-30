package number;
import java.util.*;
class amstrong1
{
    int cube(int a)
    {
        int d=a*a*a;
        return d;
    }
    int arm(int n)
    {
        amstrong1 ob=new amstrong1();
        int s=0,m=n;
        while(n>0)
        {
            int b=n%10;
            s=s+ob.cube(b);
            n=n/10;
        }
        if(s==m)
         return 1;
         else
         return 0;
        }  
    public static void main()
    {
         amstrong1 ob=new amstrong1();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(ob.arm(n)==1)
         System.out.println("the amstrong number is"+n); 
         else
         System.out.println("not amstrong number");
        }
    }