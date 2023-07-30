package number;

import java.util.*;
class amstrong
{
    public static void main()
    {
        int k,n,k1,b,c=0,sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        k=n;k1=n;
        while(k1>0)
        {
            b=k1%10;
            c++;
            k1=k1/10;
        }
        while(k>0)
        { 
            b=k%10;
            sum=sum+(int)Math.pow(b,c);
            k=k/10;
        }
        if(sum==n)
          
              System.out.println(sum+"is amstrong number");
              else
              
              System.out.println(sum+"is not a amstrong number");
            }
        }