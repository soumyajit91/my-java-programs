package array;

import java.util.*;
class columnh
   {
       public static void main()
       {
            
            System.out.println("Enter the number of row and coulumn");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            
             int r,c,max=0;
             int arr[][]=new int [n][n];
             int k=0;
            for( r=0;r<n;r++)
            {
                 for( c=0;c<n;c++)
               {
                System.out.println("Input a number for"+k+" element");
                arr[r][c]=sc.nextInt();
                k++;
               }
            }
            
            System.out.println("the array enterrd");
            for( r=0;r<n;r++)
            {
                 for( c=0;c<n;c++)
               {
                   System.out.print(arr[r][c]);
                }
                System.out.println();
            }
            for( r=0;r<n;r++)
            {
                 for( c=0;c<n;c++)
               {
                   if(max<arr[r][c])
                   {
                       max=arr[r][c];
                    }
                }
                    System.out.println("higest value in the column is "+max);
                    max=0;
                
            }
        }
    }