package number;

import java.util.*;
class maxmin
{
    public static void main()
    {
        int i,n,min,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of numbers in array");
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the number in array");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        min=arr[0];
        max=arr[0];         
        for(i=1;i<n;i++)
        {
            if(arr[i]<min)
                min=arr[i];
            else if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("largest no."+max);
        System.out.println("smallest no."+min);
    }
}