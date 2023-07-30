package others;
import java.util.*;
class binaryd
{
    int getDecimal(int b)
    {  
        int d=0,n=0,temp=0;            
        while(true)
        {  
            if(b == 0)  
                break;  
             else 
             {  
               temp = b%10;  
               d+= temp*Math.pow(2, n);  
               b=b/10;  
               n++;  
            }  
        }  
        return d;  
    } 
    public static void main()
    {
        binaryd ob=new binaryd();
        int b=0,d;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a binary no.");
        b=sc.nextInt();
        d=ob.getDecimal(b);
        System.out.println("the decimal equivalent is"+d);
    }
}
        
        
        
        