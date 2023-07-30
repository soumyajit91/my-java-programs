package computer_project;

import java.util.*;
class armstrong
 {
  public static void main() 
 {
  armstrong obj= new armstrong (); 
  int i, n, sum,m;
  Scanner sc=new Scanner (System.in); 
  System.out.print("Enter a number : ");
  n=sc.nextInt ();
  m=obj.checknum (n);
  if(n==m)
  {
  System.out.println("It is an armstrong number");
  }
  else if(m==0) 
  System.out.println("Not an armstrong number"); 
  else
  System.out.println("Not an armstrong number"); 
  }
  int checknum (int n)// recursion to check amstrong no
  {
    if(n==0)
      return 0;
     else
     return (int) Math.pow(n%10,3)+ checknum (n/10);
  }
}
