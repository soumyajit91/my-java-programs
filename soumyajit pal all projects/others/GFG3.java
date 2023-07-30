package others;


import java.util.*;
class GFG3{
    static void Even(int L)
    {
        if (L >10 )
        {
            return;
        }


        System.out.print((L*L) + " ");
        Even(L+1);
    }

    public static void main(String[] args)
    {
        int L = 1;
        System.out.print("series:");

        Even(L );
        System.out.println();

    }
}
