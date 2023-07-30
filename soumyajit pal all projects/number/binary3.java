package number;

import java.util.*;
class binary3
{
    public static void main ()
    {
        int n;
        binary3 ob=new binary3 ();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number needed to be converted to binary");
        ob.binary(sc.nextInt());         
    }
    void binary(int n)
    {
        int binary[]=new int[100],i=0,k;
         while (n > 0) {
            binary[i++] = n % 2;
            n = n/ 2;
        }
        System.out.println("The binary equivalent is ");
        for(k=i-2;i>=0;i--)
        System.out.print(binary[i]);
        
    }
}