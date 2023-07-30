package number;
import java.util.*;
class arra1
{
    void halfswap(int arr[])
    {
        int k=arr.length,i,temp=0;
        for(i=0;i<k/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[k/2+i];
            arr[k/2+i]=temp;
        }
        System.out.println("array after swaping");
        for(i=0;i<k;i++)       
            System.out.println(arr[i]);
    }
    public static void main()
    {
        int i,n;arra1 ob=new arra1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the even no.of numbers to be stored in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the numbers");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        ob.halfswap(arr);
    }
}
              
