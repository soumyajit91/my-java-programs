package number;

import java.util.*;
class speivil
{
    int evilno(int n)
    {       
        int c=0;
        while(n>0)
        {
            int b=n%2;
            if(b==1)
                c++;
            n=n/2;
        }
        if(c%2==0)
            return 0;
        else 
            return 1;
    }

    int specialno(int n)
    {
        int n1=n,dl,S=0;
        while (n1 > 0)  
        {  
            dl = n1 % 10;  
            int fact=1;  
            for(int i=1; i<=dl; i++)  
            {  
                fact=fact*i;  
            }  
            S = S + fact;  
            n1 = n1 / 10;  
        }  
        if(S==n)
            return 0;
        else
            return 1;
    }

    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int l,u,ch,a,i,freq=0;
        speivil ob= new speivil();
        System.out.println("Special evil no. are");
        for(i=1;i<1000000;i++)
        {
            if(ob.evilno(i)==0 && ob.specialno(i)==0)
                System.out.println(i+"  ");
        }
    }
}