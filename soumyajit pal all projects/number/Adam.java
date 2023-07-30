package number;

import java.util.*;
class Adam{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int n=in.nextInt();
        int m=0,r,s=0,f=0,b=0,a;
        double d=Math.pow(n,2);
         m=n;
        while(m>0)
        {          
        r=m%10;
        s=(s*10)+r;
        m=m/10;
           }
        f=(int)d;
        while(f>0)
        {
        a=f%10;
        b=(b*10)+a;
        f=f/10;
        }
        double e=Math.pow(s,2);
        
        int k=(int)e;
        if(k==b||n==s)
        {
            System.out.print(n+" is an Adam Number");
        }
        else{
            System.out.print(n+" is NOT an Adam Number");
        }
    }
}