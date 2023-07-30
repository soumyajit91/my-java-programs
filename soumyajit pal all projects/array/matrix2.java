package array;


import java.util.*;
class matrix2
   {
       public static void main()
       {
            
           
            Scanner sc=new Scanner(System.in);
             int r,c;
             int arr[][]=new int [4][4];
            for( r=0;r<4;r++)
            {
                 for( c=0;c<4;c++)
               {
                System.out.println("Input a number;");
                arr[r][c]=sc.nextInt();
               }
            }
            System.out.println("the array before swapping");
            for( r=0;r<4;r++)
            {
                 for( c=0;c<4;c++)
               {
                   System.out.print(arr[r][c]);
                }
                 System.out.println();
            }
             System.out.println();
            int d;
           
               
            for( c=0;c<4;c++)
               {
                   
                   r=arr[3][c];
                   d=arr[1][c];
                   arr[3][c]=arr[0][c];
                   
                   arr[1][c]=arr[2][c];
                   arr[2][c]=r;
                   arr[0][c]=d;
                }
                 System.out.println("array after swapping");
            
             for( r=0;r<4;r++)
            {
                 for( c=0;c<4;c++)
               {
                   System.out.print(arr[r][c]);
                }
                 System.out.println();
            }
        }
    }