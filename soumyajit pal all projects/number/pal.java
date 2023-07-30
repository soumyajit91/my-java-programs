package number;


import java.util.*; 
  
class pal
{ 
  
 
static int rev(int n, int temp) 
{ 
    
    if (n == 0) 
        return temp; 
  
    temp = (temp * 10) + (n % 10); 
  
    return rev(n / 10, temp); 
} 
  

public static void main (String[] args)  
{ 
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number to check palindrome");
    int n= sc.nextInt();
    int temp = rev(n, 0); 
      
    if (temp == n) 
        System.out.println("pallindrome number"); 
    else
        System.out.println("not pallindrome number" ); 
} 
} 