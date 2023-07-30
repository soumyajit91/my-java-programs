package array;

import java.util.*;
class linear_search1
{
    public static void main()
    {
        int i,k,pos=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter tha array elements");
        for( i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter a number to be searched");
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                pos=i+1;
            }
        }
        if(pos>0)
            System.out.println("the number is found at "+pos+"th position");
        else
            System.out.println("the number not found");
    }    
}

