package computer_project;

import java.util.*;
class GCD
{
    public static void main()  //main function 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers =");
        int p = sc.nextInt();//accepting nos.
        int q = sc.nextInt();
        GCD obj = new GCD();
        int g = obj.calc(p,q);
        System.out.println("GCD ="+g);
    }

    public int calc(int p,int q) //recursive function calculating GCD 
    {
        if(q==0)
            return p;
        else
            return calc(q,p%q);
    }
}
