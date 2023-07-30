package number;
import java.util.*;
class search
   {
       public static void main()
       {
           int i=0,j,n;
           Scanner sc=new Scanner (System.in);
           System.out.println("enter array size");
           n=sc.nextInt();
           int arr[]=new int[n];
           System.out.println("Enter a array elements");
           for( i=0;i<n;i++)
           arr[i]=sc.nextInt();
           System.out.println("Enter the no. to be checked");
           int k=sc.nextInt();
           for( i=0;i<n;i++)
           {
             for( j=i;j<n;j++)  
               {
                   if(arr[i]+arr[j]==k)
                   {
                       System.out.println(arr[i]+"+"+arr[j]+"="+k);
                       break;
                    }
                    
                }
                if(j==n)
                j--;
               if(arr[i]+arr[j]==k)
                   { 
                        break;
            }
        }
    }
}