package array;

import java.util.*;
class array1
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         int n1[]= new int[10];
         System.out.println("enter the array elements");
         for(int i=0;i<10;i++)
         {
         n1[i]=sc.nextInt();
        }
        int  k=9,t;
         for(int i=0;i<5;i++)
         {
             t=n1[i];
             n1[i]=n1[k];
             n1[k]=t;
             k--;
            }
            System.out.println("reversed array is");
           
            for(int i=0;i<10;i++)
         {
             System.out.println(n1[i]);
            }
        }
    }