import java.util.*;
class arrray2
{
    static void display(int a[][])
    {
        int i,j,n=a.length;      
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    static void display(int a[],int n)
    {
        int i;      
        for(i=0;i<n;i++)
        {

            System.out.print(a[i]);
        }
         System.out.println();
    }

    public static void main()
    {
        int r,m=0,c,t,i,j,d=0,k=0;
        arrray2 ob= new arrray2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row  of the array");
        r=sc.nextInt();
        System.out.println("Enter column  of the array");
        c=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[][]=new int [r][c];
        int ar1[]=new int[r+c];
        int ar2[]=new int[r+c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the orginal array is");
        ob.display( arr);
        for(i=0;i<r;i++)
        {
            for(j=0;j<r;j++)
            {
                for(t=1;t<arr[i][j];t++)
                {
                    if(arr[i][j]%t==0)
                        m++;
                }
                if(m==1)
                {
                    ar1[d]=arr[i][j];
                    d++;
                }
                else 
                {
                    ar2[k]=arr[i][j];
                    k++;
                }
                m=0;
            }
        }
        System.out.println("the prime array is");
        ob.display( ar1,d);
        System.out.println("the non-prime array is");
          ob.display( ar2,k);
        }
    }
