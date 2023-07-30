package punartha_sirhomework;
import java.util.*;
class sum_fact
{
    int factorial(int n)
    {
        int i,p=1;
        for(i=1;i<=n;i++)
            p=p*i;
        return p;
    }

    public static void main()
    {
        int n,s=0,i;
        Scanner sc=new Scanner(System.in);
        sum_fact ob=new sum_fact();
        System.out.println("Enter the no. for which the sum of series will be done");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
            s=s+ob.factorial(i);
        System.out.println("Sum of the series is"+s);
    }
}  