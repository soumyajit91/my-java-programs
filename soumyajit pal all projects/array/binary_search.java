package array;

import java.util.*;
class binary_search
     {
         public static void main()
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the size of the array");
             int n=sc.nextInt();
             int arr[]=new int[n];
             System.out.println("enter tha array elements");
             for(int i=0;i<n;i++)
             {
             arr[i]=sc.nextInt();
            }
            System.out.println(" the array entered elements");
             for(int i=0;i<n;i++)
             {
             
            }
             System.out.println("Enter the number to be searched");
             int k=sc.nextInt();
             int l=0,ul=n-1;int md=0,c=0;
             while(l<=ul)
             {
                 md=(l+ul)/2;
                 if(arr[md]>k)
                 l=md+1;
                 else if (arr[md]<k)
                 ul=md-1;
                 else if(arr[md]==k)
                  c=1;
                }
                if(c==1)
                 System.out.println("the number is found");
                else
                System.out.println("the number not found");
            }
        }