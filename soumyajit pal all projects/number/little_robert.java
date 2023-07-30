package number;

import java.util.*;
class little_robert
{
    public static void main()
    {
        int i,m,n,c=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the two integers rober wants to check");
        n=sc.nextInt();
        m=sc.nextInt();
        if(m>n)
        {
            for(i=1;i<m;i++)
            {
                if(m%i==0&&n%i==0)
                {
                    c++;
                }
            }
        }
        if(n>m)
        {
            for(i=1;i<n;i++)
            {
                if(m%i==0&&n%i==0)
                {
                    c++;
                }
            }
        }
        System.out.println("no. of integers divide both no. is"+c);
    }
}