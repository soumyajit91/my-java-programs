package number;

import java.util.*;
class kaprekar
{
    public static boolean isKaprekar (int number)
    {
        int square = 0, temp = 0,countDigits = 0, firstPart = 0, secondPart = 0, sum = 0;     
        square = number * number;     
        temp =square;
        while(temp!=0) {
            countDigits++;
            temp =temp/10; 
        }    
        for(int i=countDigits-1; i>0; i--) { 
            firstPart = square / (int)Math.pow(10, i);         
            secondPart = square % (int)Math.pow(10, i);         
            if(firstPart == 0 || secondPart == 0)
                continue;         
            sum = firstPart + secondPart;        
            if( sum == number )
                return true;
        }
        return false;
    }

    public static void main() 
    {   
        int number = 0;      
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the upper and lower range ");
        int l=sc.nextInt();
        int u=sc.nextInt();
        if(l>u)
            System.out.println("wrong input");
        else
        {
            for(number=l;number<=u;number++)
            {
                if(isKaprekar(number))
                    System.out.println(number+" is a"
                        + " kaprekar number");

            }
        }
    }
}
