package array;
import java.util.*;
class bilisearch
{
    static void binary(int a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int k=sc.nextInt();
        int l=0,ul=a.length-1;int md=0,c=0;
        while(l<=ul)
        {
            md=(l+ul)/2;
            if(a[md]>k)
                l=md+1;
            else if (a[md]<k)
                ul=md-1;
            else if(a[md]==k)
                c=1;
        } 
        if(c==1)
            System.out.println("the number is found");
        else
            System.out.println("the number not found");
    }

    static void linear(int a[])
    {
        int i,k,pos=0;  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be searched");
        k=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                pos=i+1;
            }
        }
        if(pos>0)
            System.out.println("the number is found at "+pos+"th position");
        else
            System.out.println("the number not found");
    }

    public static void main()
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length ofelements of array");
        int arr1[] = new int [sc.nextInt()];
        System.out.println("Enter the first  array elements");
        for (i =0;i<arr1.length;i++)       
            arr1[i]=sc.nextInt();
        System.out.println("Enter the way u want to find b-binary l-linear");
        if(sc.nextLine()=="b")
            binary(arr1);
        else if(sc.nextLine()=="l")
            linear(arr1);
    }
}