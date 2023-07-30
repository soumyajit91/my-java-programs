package string;
 import java.util.*;
class primepallindromeSchool
{
    int prime (int a)
    {
        int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            c++;
            
    }
    return c;
}
int pallindrome(int n)
     {
         int r=0,d=n;
         while(n>0)
         {
             int b=n%10;
             r=r*10+b;
             n=n/10;
            }
         if(d==r)
         return 1;
         else
         return 0;
         
        }
public static void main()
    {
        Scanner sc=new Scanner(System.in);
         primepallindromeSchool ob=new primepallindromeSchool ();
        System.out.println("enter lower and upper range ");
        int lr=sc.nextInt();
        int ur=sc.nextInt();
        if(lr<=ur)
        {
            for(int i =lr;i<=ur;i++)
            {
            if(ob.prime(i)==2)
            {
                if(ob.pallindrome(i)==1)
                {
                    System.out.println(i +"is prime pallindrome");
                }
            }
        }
    }
}
}
                
                
                
                
                
                
                
                
                
                