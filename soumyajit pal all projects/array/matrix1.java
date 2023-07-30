package array;

import java.util.*;
class matrix1
   {
       public static void main()
       {
            System.out.println("enter numnber of row and column");
           
            Scanner sc=new Scanner(System.in);
             int m=sc.nextInt();
             int arr[][]=new int [m][m];
            for(int r=0;r<m;r++)
            {
                 for(int c=0;c<m;c++)
               {
                System.out.println("Input a number;");
                arr[r][c]=sc.nextInt();
               }
            }
            System.out.println("the array before swapping");
            for(int r=0;r<m;r++)
            {
                 for(int c=0;c<m;c++)
               {
                   System.out.print(arr[r][c]);
                }
                 System.out.println();
            }
            int t;
            for(int c=0;c<m;c++)
               {
                   t=arr[0][c];
                   arr[0][c]=arr[m-1][c];
                   arr[m-1][c]=t;
                }
             System.out.println("the array after swapping are");
            for(int r=0;r<m;r++)
            {
                 for(int c=0;c<m;c++)
               {
                   System.out.print(arr[r][c]);
                }
                System.out.println();
            }
            
        }
    }
            
            
            
            
            
            
            