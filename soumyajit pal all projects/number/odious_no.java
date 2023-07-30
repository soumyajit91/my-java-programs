package number;
import java.util.*;
class odious_no 
{
    String toBinary(int n) // Function to convert a number to Binary
    {
        int r;
        String s=""; //variable for storing the result
        char dig[]={'0','1'}; //array storing the digits (as characters) in a binary number system
        while(n>0)
        {
            r=n%2; //finding remainder by dividing the number by 2
            s=dig[r]+s; //adding the remainder to the result and reversing at the same time
            n=n/2;
        }
        return s;
    }

    int countOne(String s) // Function to count no of 1�s in binary number
    {   
        int c = 0, l = s.length();
        char ch;
        for(int i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch=='1')
            {
                c++;
            }

        }
        return c;
    }

    public static void main(String args[])
    {
        odious_no ob = new odious_no();int freq=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range");
        int l = sc.nextInt();
        int u=sc.nextInt();
        for(int n=l;n<=u;n++)
        {
            String bin = ob.toBinary(n);            
            int x = ob.countOne(bin);
            if(x%2!=0)  
            {
                System.out.println(n);
                freq++;
        }
    }
    System.out.println("the frequency is"+freq);
}
}