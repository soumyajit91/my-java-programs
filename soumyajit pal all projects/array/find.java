package array;

import java.util.*;
class find
{
    void calculate(int arr[][],int n)
    {
        int max=0,row=0,column =0;
        for( int r=0;r<n;r++)
        {
            for( int c=0;c<n;c++)
            {
                if(max<arr[r][c])
                {
                    max=arr[r][c];
                    row = r;column=c;
                }
            }

        }
        row++;column++;
        System.out.println("the highest value in the matrix is "+ max +" in row"+ row+"in column"+column);
    }

    void Display(int num[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(num[i][j]+"    ");
            }
            System.out.println();
        }
    }

    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the array size");
        find ob= new find();
        int n = sc.nextInt();
        if(n<=20)
        {
            int arr[][] = new int [n][n];
            System.out.println("Enter the array element");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Original matrix");   
            ob. Display(arr,n) ;  
            ob. calculate(arr,n);
            int temp=0;
            int arr1 [] = new int[n*n];
            int k=0;
            for(int i=0;i<n;i++)
            {

               
                    for(int j=0;j<n-1;j++)
                       {
                         arr1[k]=arr[i][j];
                         k++;
                        }
                
            }
            
             for(int i=0;i<n;i++)
            {
                
            }
            System.out.println("Array after sorting"); 
            ob.Display(arr,n);
        }
    }
}

