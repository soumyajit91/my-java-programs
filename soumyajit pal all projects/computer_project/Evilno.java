package computer_project;

import java.util.*;
class Evilno
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a no.");
        int n=sc.nextInt();// enters the number to be checked 
        int c=0;
        while(n>0)// loop to check if pronic number or not 
        {
            int b=n%2;
            if(b==1)
            c++;
            n=n/2;
        }
        if(c%2==0)
        System.out.println(" evil no.");
        else
        System.out.println("not evil no.");
    }
}

