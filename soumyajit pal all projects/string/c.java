package string;

import java.util.*;
class c
{

    public static void main(int n[][])
    {
        int p =0;
        for(int i = 0;i<n.length;i++)
        for(int j = 0;j<n[i].length;j++)
        {
        if(i!=0 || i!=n.length||j!=0||j!=n[i].length-1)
        p=p+n[i][j];
        }
        System.out.print(p);
        
    }

}