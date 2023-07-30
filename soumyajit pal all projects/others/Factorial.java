package others;
import java.util.*;
public class Factorial 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a no.");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        long fact = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + fact);
    }
    public static long multiplyNumbers(int n)
    {
        int i,f=1;
        for(i=1;i<=n;i++)
        f*=i;
        return f;
    }
}

