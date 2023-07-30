package array;

import java.util.*;
class syssmetric
 {
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the array row and column");
         int i,j;
         int n=sc.nextInt();
         int arr[][]=new int[n][n];
          System.out.println("the enter array element");
          for(i=0;i<n;i++)
          {
              for(j=0;j<n;j++)
              {
                  arr[i][j]=sc.nextInt();
                }              
            }
            int c=0;
          for(i=0;i<n;i++)
          {
              for(j=0;j<n;j++)
              {
                  if(arr[i][j]!=arr[j][i])
                  {
                      c=1;
                      break;
                 
                }
              
            }
        }
        if(c==0)
        System.out.println("Sysmetric array");
        else
        System.out.println("not sysmetric array");
    }
}