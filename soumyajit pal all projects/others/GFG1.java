package others;
import java.util.*;
class GFG1{
    static void Even(int L,int R)
    {
        if (R < L)
        {
            return;
        }
        if(R % 2 == 0 )
            Even(L, R - 2);
        else
            Even(L, R - 1);
        if (R % 2 == 0)
        {
            System.out.print(R + " ");
        }
    }
    public static void main(String[] args)
    {
        int L = 2, R = 20;
        System.out.print("Even numbers:");
        Even(L, R);
        System.out.println();
    }
}

