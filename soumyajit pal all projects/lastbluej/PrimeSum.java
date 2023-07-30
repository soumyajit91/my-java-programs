package lastbluej;

import java.util.*;
class PrimeSum
{
    int N,sum,i;
    PrimeSum()
    {
        N=0;
        sum=0;
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        N=sc.nextInt();
    }

    int prime(int n,int a)
    {
        if(n==2)
            return 2;
        else if(n%a==0)
            return 0;
        else if(a*a>n)
            return n;
        return prime(n,i+1);
    }

    void display()
    {
        while(i<=n)
        {
            if(prime(i,2)>0)
            {
                sum=sum+prime(i,2);
            }
        }
        System.out.println("The sum of the series is"+sum);
    }
    
    public static void main()
    {
        PrimeSum ob = new PrimeSum();
        
        