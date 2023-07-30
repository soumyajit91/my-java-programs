package number;

import java.util.*;
class haiuin

{
    int happy(int a )
    {
        int k=a;
        int b,sum;
        while(k>9)
        {
            sum=0;

            while(k>0)
            { 
                b=k%10;
                sum=sum+b*b;
                k=k/10;
            }
            k=sum;
        }
        if(k==1)
            return 0;
        else
            return 1;
    }

    int unique(int a)
    {
        int k=a,k1=a;
        int b,c=0,b2;
        while (k > 0)  
        {                   
            b= k % 10;  
            while (k1 > 0)  
            {  
                b2 = k1 % 10;   
                if (b == b2)  
                {  

                    c++;  
                }   
                k1 = k1 / 10;  
            }   
            k = k / 10;  
        } 
        if(c==1)
            return 0;
        else
            return 1;
    }

    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int l,u,ch,a,i,freq=0;
        haiuin ob= new haiuin();
        System.out.println("Enter the lower and upper range");
        l=sc.nextInt();
        u=sc.nextInt();
        System.out.println("Enter the choice 1. happy no. 2. unique no.");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Happy no. within this range is");
            for(i=l;i<u;i++)
            {
                a=ob.happy(i);
                if(a==0)
                {
                    freq++;
                    System.out.print(i+"   ");
                }
            }
            System.out.println("happy no. found are"+freq);
            break;
            case 2:
             System.out.println("unique no. within this range is");
            for(i=l;i<u;i++)
            {
                a=ob.unique(i);
                if(a==0)
                {
                    freq++;
                    System.out.print(i+"  ");
                }
            }
            System.out.println("unique found are"+freq);
            break;
            default :
            System.out.println("wrong input");
        }
    }
}
