package computer_project;

import java.util.*;
public class isc2019q2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        if(n>2&&n<10)
        {
            int a[]=new int[n];
            int b[][]=new int[n][n];
            int i,j;
            for(i=0;i<n;i++)
            {
                System.out.println("ENTER THE ELEMENT");
                a[i]=sc.nextInt();
            }
            //sorting the array a[] using bubble sort method
            for(i=0;i<n-1;i++)
            {
                for(j=0;j<n-i-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            //printing the sorted array
            System.out.print("SORTED ARRAY: ");
            for(i=0;i<n;i++)
                System.out.print(a[i]+" ");
            //STORING VALUES IN ARRAY "B"
            for(i=0;i<n;i++)
            {
                int flag=n-i;
                int x=0;
                for(j=0;j<n;j++)
                {
                    if(flag==0)
                        x=0;
                    b[i][j]=a[x++];
                    flag--;
                }
            }
            //PRINTNG THE ARRAY "B"
            System.out.println("\n FILLED MATRIX");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("MATRIX OUT OF RANGE");
    }
}