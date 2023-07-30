package array;

import java.util.*;
class array17
{
    int fact(int n)
    {
        int c=1;
        for(int i=1;i<=n;i++)
          c=c*i;
        return c;
        }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int ar[]=new int[n];
        array17 ob=new array17();int p;
        System.out.println("enter array element");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
             p=ar[i];
            if(i%2==0)
            {
                int k=ob.fact(p);
                System.out.println(k);
            }
        }
    }
}