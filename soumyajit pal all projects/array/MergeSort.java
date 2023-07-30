package array;


import java.util.*;
class MergeSort
    {
        int A[],B[],C[];
        int m,n,i,j;
        MergeSort(int nx,int ny)
        {
            m=nx;n=ny;
            A=new int[m];
            B=new int[n];
            C=new int[m+n];
        }
        void inpdata()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter elements of First sorted array");
            for(i=0;i<m;i++)
            A[i]=sc.nextInt();
            System.out.println("Enter elements of second sorted array");
            for(i=0;i<n;i++)
            B[i]=sc.nextInt();
        }
        void merge_sort()
        {
            int k=0,r=0;
            for(i=0;i<m;i++)
            
                C[i]=A[i];               
            for(j=m;j<(m+n);j++)    
                {
                     for(i=0;i<m;i++)
                     {
                    if(C[i]==B[r])
                    k=1;
                }
                if(k==0)
                C[j]=B[r];
                k=0;
                r++;
            }
        }
        void Display()
        {
            System.out.println("The first array is");
            for(i=0;i<m;i++)
            System.out.print(A[i]+"  ");
             System.out.println("The second array is");
             for(i=0;i<n;i++)
              System.out.print(B[i]+"  ");
               System.out.println("The final array is");
            for(j=0;j<(m+n);j++)
             System.out.print(C[i]+"  ");
            }
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of first and second array");
            int nx=sc.nextInt();
            int ny=sc.nextInt();
            MergeSort ob=new MergeSort(nx,ny);
            ob.inpdata();
            ob.merge_sort();
            ob.Display();
        }
    }
    
