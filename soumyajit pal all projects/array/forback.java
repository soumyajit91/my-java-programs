package array;

import java.util.*;
class forback
   {
      static void display(int arr[],int n)
      {    int i;
           for(i=0;i<n;i++) 
           System.out.print(arr[i]);
           System.out.println();
        }
      public static void main()
      {
          int i,k;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the no. values in array");
          int n=sc.nextInt();
          int []a= new int[n],b= new int[n],c= new int[n]; 
          System.out.println("Enter array elements");
          for(i=0;i<n;i++)           
               a[i]=sc.nextInt();
          for(i=0;i<n;i++)           
               b[i]=a[i];
               k=0;
          for(i=n-1;i>=0;i--)           
               c[i]=a[k++];
          display(a,n) ;    
          System.out.println("forward array");
           display(b,n) ;
           System.out.println("forward array");
           display(c,n);
        }
    }
    