package others;
import java.util.*;
import java.io.*;
 class Fibonacck
     {
          public static void main() throws IOException //main function 
            {
         Scanner sc=new Scanner(System.in); 
System.out.println("enter no of term ="); //accepting no. of terms int n = sc.nextInt();
int n=sc.nextInt();
Fibonacck obj = new Fibonacck();
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
