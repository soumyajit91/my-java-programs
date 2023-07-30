package number;
import java.util.*;
 class krishna
 {
     int c=1;
  int factors(int n, int i) 
    { 
        
        if (i <= n) 
        { 
               c=c*i;
           
     
            factors(n, ++i); 
        } 
        return c;
    } 

     int rev(int n, int temp) 
{ 
    
    if (n == 0) 
        return temp; 
    int b=n%10;
    temp = temp+factors(b,1) ; 
   c=1;
    return rev(n / 10, temp); 
} 
public  void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the krishna murti number");
    int n=sc.nextInt();
    int m=rev(n,0);
    if(n==m)
    System.out.println("krishna murti number");
    else
    System.out.println("not krishna murti");
}
}