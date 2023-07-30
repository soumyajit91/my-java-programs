package number;

import java.util.*;
public class Special

{
    int n,sum=0;
    Special()
    {
     n=0;
    }
    Special(int nn)
    {
        n=nn;
    }
     void Sum()
    {
        
         int temp=n;
        while(temp!=0)
        {
            int a=temp%10;int fact=1;
            for(int i=1;i<=a;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            temp=temp/10;
        }
    }
    void isSpecial()
    {
        if(sum==n)
        {
            System.out.println(n+" is a Special Number.");
        }
        else
        {
            System.out.println(n+" is not a Special Number.");
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked.");
        
        int num=sc.nextInt();
        Special ob= new Special (num);
        ob.Sum();
        ob.isSpecial();
    }
}