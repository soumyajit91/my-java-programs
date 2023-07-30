package array;
import java.util.*;
class arrmerg
{
    public static void main()
    {           
        int i=0,k=0,j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first array");
        int arr1[] = new int [sc.nextInt()];
        System.out.println("Enter the length of second array");
        int arr2[] = new int [sc.nextInt()];
        int arr3[] = new int [arr1.length+arr2.length];
        System.out.println("Enter the first array elements");
        for (i =0;i<arr1.length;i++)       
            arr1[i]=sc.nextInt();
        System.out.println("Enter the second array elements");    
        for (i =0;i<arr2.length;i++)
        
            arr2[i]=sc.nextInt(); 
            
        for ( i =0;i<arr3.length;i++)
        {
            if(arr2.length !=0)
            {
                arr3[i]=arr1[k];
                k++;i++;
            }
            if(arr2.length !=0)
            {
                arr3[i]=arr2[j];
                j++;
            }

        }
        System.out.println("the third array is");
        for (i =0;i<arr3.length;i++) 
        {
            System.out.println(arr3[i]);
        }
    } 
}     

