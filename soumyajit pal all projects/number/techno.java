package number;
import java.util.*;
class techno
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0,p=n;
         while(n>0)
        {
            int b=n%10;
            s++;
            n=n/10;
        }
        if(s%2==0)
        {
        int f=p%(int)Math.pow(10,(s/2));
        int l=p/(int)Math.pow(10,(s/2));
        if((l+f)*(l+f)==p)
        System.out.println("tech no.");
        else
        System.out.println(" not tech no.");
    }
}
}
        
