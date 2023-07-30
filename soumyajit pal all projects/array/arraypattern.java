package array;

import java.util.*;
class arraypattern
  {
      public static void main()
      {
          int i,j;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the row and column of array");
          int n=sc.nextInt();
          int ar[][]=new int[n][n];
          System.out.println("the array element is");
          for(i=0;i<n;i++)
          {
              for(j=0;j<n;j++)
              {
                  ar[i][j]=sc.nextInt();
                }
            }
            System.out.println("the pattern is");
           for(i=0;i<n;i++)
          {
              for(j=0;j<n;j++)
              {
                  if(i==j||i>j)
                  System.out.print(ar[i][j]);
                  else
                  System.out.print("  ");
                }
              System.out.println();
            }
        }
    }
