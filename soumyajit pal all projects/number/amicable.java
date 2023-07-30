package number;
import java.util.*;
class amicable
{
    int factor(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            s=s+i;
        }
        return s;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter both the number");
        int n1= sc.nextInt();
        int n2=sc.nextInt();
         amicable ob=new amicable();
        if((n1==ob.factor(n2))&&(n2==ob.factor(n1)))
        
            System.out.println("amicable number");
            else
            System.out.println("not amicable number");
        }
    }