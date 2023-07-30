package array;
import java.util.*;
class ascending
   {
       public static void main()
       {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter the array size ");
           int n=sc.nextInt();
           int arr[][]=new int[n][n];
           int i,j;
           System.out.println("enter the size of the array");
            for(i=0;i<n;i++)
          {
              for(j=0;j<n;j++)
              {
                  arr[i][j]=sc.nextInt();
                }              
            }
          System.out.println("the original array");
           for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }
            int d=0;
            int ar1[] = new int[n];
           for(i=0;i<n;i++)
           {
               for(j=0;j<n;j++)
               {
                   ar1[d]=arr[i][j];
                   d++;
                }
            }
            int swap=0;
           for(i=0;i<n-1;i++)
           {
               if(ar1[i]< ar1[i+1])
               swap=ar1[i+1];
               ar1[i+1]=ar1[i];
               ar1[i]=swap;
            }
            d=0;
            for(i=0;i<n;i++)
           {
               for(j=0;j<n;j++)
               {
                   arr[i][j]=ar1[d];
                   d++;
                }
            }
            System.out.println("the final array is");
            for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }
            }
        }