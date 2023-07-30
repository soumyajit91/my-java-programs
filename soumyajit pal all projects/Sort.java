import java.util.*;
public class Sort 
{  
    int i,j;
    void selectionSort(int[] arr1)
    {  
        int small,tmp,pos;
        for(i=0;i<arr1.length;i++)
        { 
            small=arr1[i];             
            pos=i;
            for(j=i+1;j<arr1.length;j++)
            {
                if(arr1[j]<small)
                {
                    small=arr1[j];             
                    pos=j;
                }
            }
            tmp=arr1[i];
            arr1[i]=arr1[pos];
            arr1[pos]=tmp;
        }
    }

    public  void main()
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array to be sorted");
        int arr1[]= new int[10];
        for( i=0;i<10;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Before Selection Sort");  
        for(i=0;i<10;i++)
        {  
            System.out.print(arr1[i]+" ");  
        }  
        System.out.println();  

        selectionSort(arr1); 

        System.out.println("After Selection Sort");  
        for( i=0;i<10;i++){  
            System.out.print(arr1[i]+" ");  
        }  
    }  
}  