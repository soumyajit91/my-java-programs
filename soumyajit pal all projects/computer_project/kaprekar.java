package computer_project;
import java.util.*;
class kaprekar
{
    public static boolean isKaprekar (int number)
    {
        int square = 0, temp = 0,countDigits = 0, firstPart = 0, secondPart = 0, sum = 0;     
        square = number * number;     
        temp =number;
        while(temp!=0) {
            countDigits++;
            temp =temp/10; 
        }            
            firstPart = square / (int)Math.pow(10, countDigits);         
            secondPart = square % (int)Math.pow(10,  countDigits);                              
            sum = firstPart + secondPart;        
            if( sum == number )
                return true;        
        return false;
    }

    public static void main() 
    {   
        int number = 0,freq=0;      
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the upper and lower range ");
        int p=sc.nextInt();
        int q=sc.nextInt();
        if(p>q&&q>5000)
            System.out.println("out of range ");
        else
        {
            System.out.println("The kaperkar no.s are");
            for(number=p;number<=q;number++)
            {
                if(isKaprekar(number))
                    {System.out.print(number+" ");
                      freq++;  
                    }
                
            }
            if(freq==0)
            System.out.print("NIL");
            System.out.println();
            System.out.println("The frequency of is"+freq);
        }
    }
}