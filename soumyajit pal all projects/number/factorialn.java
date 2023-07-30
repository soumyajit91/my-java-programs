package number;


import java.util.Scanner;
public class factorialn
{
    int c=0;
    public static void main() 
    {
        int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        factorialn obj = new factorialn();
        x = obj.factors(n, 1);
       
            System.out.println(x+" no of factors is present");
        
        
    }
   int factors(int n, int i) 
    { 
        
        if (i <= n) 
        { 
            if (n % i == 0)
            { 
               c++;
            }
     
            factors(n, ++i); 
        } 
        return c;
    } 
}