package computer_project;

import java.util.*;
class array
   {
       public static void main() 
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the order of array");
           int M=sc.nextInt();
           int arr[][]= new int[M][M];
           int A[]=new int[(M-2)*(m-2)];
           int i,j;
           System.out.println("Enter the array elements");
           for(i=0;i<M;i++)
           {
               for(j=0;j<N;j++)
               {
                   arr[i][j]=sc.nextInt();
                }
            }
           System.out.println("Orginal array");
           for(i=0;i<M;i++)
           {
               for(j=0;j<N;j++)
               { 
                   System.out.print(arr[i][j]);
                }
                System.out.println();
            }
           int  k=0;
              for(i=0;i<M;i++)
           {
               for(j=0;j<N;j++)
               { 
                   if(i==0&&j==0&&i==M-1&&j==M-1)
                   {
                       A[k]=arr[i][j];
                       k++;
                    }
                }
            }
            int t;
             for(i=0;i<(M-2)*(M-2);i++)
           {
               for(j=i+1;j<(M-2)*(M-2);j++)
               { 
                   if(A[i]>A[j])
                   {
                       t=A[i];
                       A[i]=A[j];
                        A[j]=t;
                    }
                }
            }
                   
                   