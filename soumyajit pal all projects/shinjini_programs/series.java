package shinjini_programs;

import java.util.*;
public class series{
int sum(int a){
int i,s=0;
for(i=1;i<a;i++)
s= s+(i*(i+1));
return (s);
}
public static void main(){
Scanner sc=new Scanner(System.in);
int p,n;
System.out.println("Enter the value of n");
n=sc.nextInt();
series ob= new series();
p=ob.sum(n);
System.out.println("the sum of series "+p);
}
}