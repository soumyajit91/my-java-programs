package computer_project;

import java.util.*;
 class Dec2Bin
 {
int n,i; 
int a[]=new int[100]; ;
Scanner sc=new Scanner(System.in);
 public Dec2Bin(int nn) //parameterized contructor
 {
n=nn;
 }
 public void dectobin(int no) //function converting decimalto binary number
 {
int c = 0;
 int temp = no;
 while(temp != 0)
 
{a[c++] = temp % 2; 
temp = temp / 2; 
}
 System.out.println("Binary eq. of "+no+" = ");
 for( i = c-1 ; i>=0 ; i--) //Displaying binary number
 System.out.print( a[ i ] );
}public static void main()
{
Scanner sc=new Scanner(System.in);
Dec2Bin obj=new Dec2Bin(100);
System.out.println("Enter the decimal number");
int no=sc.nextInt();
obj.dectobin(no);
}
}
