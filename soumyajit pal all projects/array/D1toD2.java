package array;

import java.util.*;
class D1toD2
   {
       public static void main()
       {
           int i,j;
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a no were square root is possible .");
           int n=sc.nextInt();
           int ar[]=new int[n];
           System.out.println("Enter the Array element");
           for(i=0;i<n;i++)
           ar[i]=sc.nextInt();
           int k=(int)Math.sqrt(n);
           int ar1[][]=new int[k][k];
           int d=0;
           for(i=0;i<k;i++)
           {
               for(j=0;j<k;j++)
               {
                   ar1[i][j]=ar[d];
                   d++;
                }
            }
            System.out.println("the corresponding 2D array is");
            for(i=0;i<k;i++)
           {
               for(j=0;j<k;j++)
               {
                   System.out.print(ar1[i][j]);
                }
                System.out.println();
            }
        }
    }
                   