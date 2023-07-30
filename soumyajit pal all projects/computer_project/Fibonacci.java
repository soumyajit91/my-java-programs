package computer_project;

import java.util.*;
class Fibonacci 
{
    public static void main()  //main function 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no of term ="); //accepting no. of terms
        int n = sc.nextInt();
        System.out.println(); 
        Fibonacci obj = new Fibonacci ();
        for(int i=1;i<=n;i++) //Fibonacci element display loop 
        {
            int f = obj.fib(i);
            System.out.print(f+" ");
        }
    }

    public int fib(int n) //Recursive function fib() to find Fibonacci  element
    {
        if(n<=1)
            return n; 
        else return (fib(n-1) +fib(n-2));
    }
}

