package array;

import java.util.*;
class mergearr
{    
    static int[] ret( int a[])
    {
        int i=0,k=0,j=0,min,l,temp;
        for(i=0;i<a.length;i++)
        {
            min=i;
            for(l=i+1;l<a.length; l++)     
              {
                  if(a[l]<a[min])
                  min=l;
                }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }  
        return a;         
    }
    public static void main()
    {  mergearr ob=new mergearr();          
        int i=0,k=0,j=0,min,l,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first array");
        int arr1[] = new int [sc.nextInt()];
        System.out.println("Enter the length of second array");
        int arr2[] = new int [sc.nextInt()];
        int arr3[] = new int [arr1.length+arr2.length];
        System.out.println("Enter the first  array elements");
        for (i =0;i<arr1.length;i++)       
            arr1[i]=sc.nextInt();
        int arr[] = ob.ret(arr1);
        for (i =0;i<arr1.length;i++) 
        {
            System.out.println(arr[i]);            
        }
        System.out.println("Enter the second   array elements");    
        for (i =0;i<arr2.length;i++)       
            arr2[i]=sc.nextInt(); 
        int arr4[] = ob.ret(arr2);
        for (i =0;i<arr2.length;i++) 
        {
            System.out.println(arr4[i]);           
        }
         for ( i =0;i<arr3.length;i++)
        {
            if(arr.length !=0)
            {
                arr3[i]=arr[k];
                k++;i++;
            }
            if(arr4.length !=0)
            {
                arr3[i]=arr4[j];
                j++;
            }
        }
         int arr5[] = ob.ret(arr3);
        System.out.println("the third array is");
        for (i =0;i<arr5.length;i++) 
        {
            System.out.println(arr3[i]);
            
        }       
    }    
}
        
       
        
        
        
        
        
        
        
        
        
            
