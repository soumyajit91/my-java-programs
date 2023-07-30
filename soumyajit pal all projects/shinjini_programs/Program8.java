package shinjini_programs;

import java.util.*;
class Program8
{
    public static void main()
    {
     int ch,n,c,f,sq,m;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter a no.");
     n=in.nextInt();
     System.out.println("Enter 1 for prime no checking\nEnter 2 for Automorphic no. checking");
     ch=in.nextInt();
     switch(ch)
     {
        case 1 : c=0; 
         for(int i=1;i<=n;i++)
         {
            if(n%i==0)
                c++;
            }
         if(c==2)
          System.out.println(n+" is Prime no.");
        else
          System.out.println(n+" is not a Prime no.");
        break;
        case 2: f=0;
         m=n;
         sq=n*n;
         while(n>0)
         {
           if(n%10!=sq%10)
           {
            f=1;
            break;
            }
           n/=10;
           sq/=10;
        }
        if(f==0)
        System.out.println(m+" is Automorphic no.");
        else
        System.out.println(m+" is not Automorphic no.");
        break;
        default: System.out.println("Invalid input");
     }
    }
}