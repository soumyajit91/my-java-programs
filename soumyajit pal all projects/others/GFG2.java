package others;


import java.util.*;
class GFG2{
    static void Even(int L)
    {
        if (L <2 )
        {
            return;
        }

        

       
            System.out.print(L + " ");
            Even(L-2);
        }
    
    public static void main(String[] args)
    {
        int L = 20;
        System.out.print("Even numbers:");

        Even(L );
        System.out.println();

    }
}
