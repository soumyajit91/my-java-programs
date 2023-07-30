package array;

import java.util.*;
class transmirror
   {
       public static void main()
       {//start of the main method
           Scanner sc=new Scanner(System.in);
           int i,j;
           System.out.println("Enter the row and element of the array");
           int n=sc.nextInt();
           int ar[][]=new int[n][n];
           int ar1[][]=new int[n][n];
           int ar2[][]=new int[n][n];
           System.out.println("enter the array element");
            for(i=0;i<n;i++)//the input loop
          {
              for(j=0;j<n;j++)
              {
                  ar[i][j]=sc.nextInt();
                }
            }
          System.out.println("the entered array");
          for(i=0;i<n;i++)//the display loop
          {
              for(j=0;j<n;j++)
              {
                  System.out.print(ar[i][j]+"\t");
                }
              System.out.println();
            }
          for(i=0;i<n;i++)//transpose loop
          {
              for(j=0;j<n;j++)
              {
                 ar1[i][j]=ar[j][i];
                }
            }
           System.out.println("after transpose");
            for(i=0;i<n;i++)//post transpose display loop
          {
              for(j=0;j<n;j++)
              {
                  System.out.print(ar1[i][j]+"\t");
                }
              System.out.println();
            }
           for(i=0;i<n;i++)// mirror loop
          {
              for(j=0;j<n;j++)
              {
                  ar2[i][j]=ar1[i][n-j-1];
                }
            }
          System.out.println("the final array");
           for(i=0;i<n;i++)//final display loop
          {
              for(j=0;j<n;j++)
              {
                   System.out.print(ar2[i][j]+"\t");
                }
              System.out.println();
            }

        }//end of main method
    }





 