package computer_project;


import java.util.*; 
class Factorial 
   {
     public static void main()//main function
 {
Scanner sc=new Scanner (System.in);
System.out.println("enter no ="); 
int n =sc.nextInt(); //accepting no. 
Factorial obj = new Factorial(); 
long f = obj.fact(n); 
System.out.println("Factorial ="+f); //displaying factorial 
}
 public long fact(int n) //recursive fact()
 {
    if(n<2) 
return 1;
 else 
return (n*fact(n-1)); 
}
}
