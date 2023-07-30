package number;
import java.util.*;
class arm
{ 
  
 
static int rev(int n, int temp) 
{ 
    
    if (n == 0) 
        return temp; 
    int b=n%10;
    temp = temp+(int)Math.pow(b,3) ; 
  
    return rev(n / 10, temp); 
} 
  

public static void main (String[] args)  
{ 
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number to check amstrong");
    int n= sc.nextInt();
    int temp = rev(n, 0); 
      
    if (temp == n) 
        System.out.println("amstrong number"); 
    else
        System.out.println("not amstrong number" ); 
} 
}