package array;

import java.util.*;
class MatRev
{
    int arr[][],m,n;
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("input number for the array =");
                arr[i][j]=sc.nextInt();
            }
        }
    }
    int reverse(int x)
    {
        int revs=0;
        while(x>0)
        {
            revs = revs*10+(x%10);
            x=x/10;
        }
        return (revs);
    }
    void revMat(MatRev p)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=reverse(p.arr[i][j]);
            }
        }
    }
    void show()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.ou.println(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the row and column of matrix");
        int k=sc.nextInt();
        MatRev ob1=new MatRev(k,k);
        MatRev ob2=new MatRev(k,k);
        obj1.fillarray();
        
        
        
        
        
        
    