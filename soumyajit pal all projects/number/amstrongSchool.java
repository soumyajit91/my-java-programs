package number ;

import java.util.*;
class amstrongSchool
{
    int arm(int n)
    {
        int s=0,m=n;
        while(n>0)
        {
            int b=n%10;
            s=s+(int)Math.pow(b,3);
            n=n/10;
        }
        if(s==m)
         return 1;
         else
         return 0;
        }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        amstrongSchool ob=new amstrongSchool();
        System.out.println("enter lower and upper range ");
        int lr=sc.nextInt();
        int ur=sc.nextInt();
        if(lr<ur)
        {
            for(int i=lr;i<=ur;i++)
            {
                int k=i;
                if(ob.arm(k)==1)
                System.out.println(i);
               
            }
        }
            else
            System.out.println("try again");
        }
    }
                    
    
