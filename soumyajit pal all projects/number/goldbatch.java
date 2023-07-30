package number;
import java.util.*;
class goldbatch 
{
    int oddeven(int a)
    {
        if(a%2==0)
            return 1;
        else
            return 2;
    }

    int prime  (int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                c++;

        }
        if (c==2)
            return 1;
        else
            return 2;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        goldbatch  ob=new goldbatch   ();
        System.out.println("enter a number");
        int n =sc.nextInt();
        if(ob.oddeven(n)==1)
        {
            for(int i=n/2;i<=n;i++)
            {

                if(ob.oddeven(i)==2&&ob.prime(i)==1)
                {
                    int d=n-i;
                    if(ob.oddeven(d)==2&&ob.prime(d)==1)
                        if(i+d==n)
                            System.out.println(" gold batch" +i + "+"+d+"="+n);
                }
            }
        }
    }
}
                   
             
             
             