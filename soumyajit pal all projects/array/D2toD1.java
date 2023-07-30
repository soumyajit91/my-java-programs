package array;

import java.util.*;
class D2toD1
  {
      public static void main()
      {
           Scanner sc=new Scanner (System.in);
           int i,j;
           System.out.println("Enter the rows and columns of the array");
           int n=sc.nextInt();
           int ar[][]=new int[n][n];
           System.out.println("Enter the Array element");
           for(i=0;i<n;i++)
           {
                 for(j=0;j<n;j++)
               {
               ar[i][j]=sc.nextInt();
            }
           }
           int k=n*n;
           int ar1[]=new int[k];
           int d=0;
           for(i=0;i<n;i++)
           {
               for(j=0;j<n;j++)
               {
                   ar1[d]=ar[i][j];
                   d++;
                }
            }
            System.out.println("the corresponding 1D array is");
            for(i=0;i<k;i++)
           {
              
                   System.out.print(ar1[i]);
                
                
            }
        }
    }
               
  