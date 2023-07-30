package number;

import java.util.Scanner;
public class pell 
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
	int n,a=1,b=0,c;
	System.out.println("Enter the number of terms till which pell series be excuted");
	int r=sc.nextInt();
    System.out.println("First "+r+" Pell numbers: ");
    for(n=1; n<=r; n++)
     {
      c= a + 2*b;
      System.out.print(c+" ");
      a = b;
      b = c;
     }
   }
 }

