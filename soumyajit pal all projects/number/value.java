package number;
import java.util.*;
class value
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double p;
        String ch="y";
        System.out.println("Enter 'n' to terminate the program");
        while(ch =="y")
        {
            System.out.println("Enter the value of a,b,c");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            p=(Math.pow(a,b)*Math.pow(b,c))/(a*b*c);
            System.out.println("the result="+p);
            System.out.println(" want to continue...... then enter 'y'");
            ch= sc.next();
        }
        System.out.println("the program terminates");
    }
}