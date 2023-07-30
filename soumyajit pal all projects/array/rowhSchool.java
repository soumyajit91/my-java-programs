package array;

import java.util.*;
class rowhSchool
   {
       int r,c;
       void input(int arr[][],int n)
       {
           Scanner sc=new Scanner (System.in);
           
           System.out.println("Enter matrix of size "+n+"x"+n+" size");
           for( r=0;r<n;r++)
            {
                 for( c=0;c<n;c++)
               {
                   arr[r][c]=sc.nextInt();
                }
            }
            
        }
       void calculate(int arr[][],int n)
       {
           int max=0;
             for( r=0;r<n;r++)
            {
                 for( c=0;c<n;c++)
               {
                   if(max<arr[r][c])
                   {
                       max=arr[r][c];
                    }
                }
                    System.out.println("higest value in the row is "+max);
                    max=0;
                
            }
        }
        void display(int arr[][],int n)
        
        { for( r=0;r<n;r++)
            {
                 for( c=0;c<n;c++)
               {
                   System.out.println(arr[r][c]);
                }
            }
        }
          public static void main()
          {
              
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter no. of elements of array");
              int n=sc.nextInt();
              int arr[][]=new int[n][n];
              rowhSchool ob=new rowhSchool();
              ob.input(arr,n);
              System.out.println("the array entered is");
              ob.display(arr,n);
              ob.calculate(arr,n);
            }
        }