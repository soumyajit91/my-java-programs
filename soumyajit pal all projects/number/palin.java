package number;
import java.util.*;
class palin
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int k=n,rev=0,b;
        while(k>0)
        {
            b=k%10;
            rev=rev*10+b;
            k=k/10;
        }
        if(rev==n)
        System.out.println("pallindrome");
        else
        System.out.println("not pallindrome");
    }
}
        
     