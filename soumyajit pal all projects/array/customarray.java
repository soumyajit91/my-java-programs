package array;
import java.util.*;
class customarray
{
    void Display(int num[][],int r ,int c)
    {
        int i=0,j;
        while (i < r) {
            j = 0;
            while (j < c) {
                System.out.print(num[i][j] + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }

    public static void main()
    {
        Scanner sc =  new  Scanner(System.in);
        int i;
        int j;
        customarray ob=new customarray();
        System.out.println("Enter the row ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] num =  new  int[m][n];
        int[][] num1 =  new  int[n][m];
        System.out.println("the elements of " +m+"*"+n+" 4 matrix are:");
        i = 0;
          if(m>2&&m<5)
        {
        while (i < m) {
            j = 0;
            while (j < n) {
                num[i][j] = sc.nextInt();
                j = j + 1;
            }
            i = i + 1;
        }
      
           
            System.out.println("The Original array");
            ob.Display(num,m,n);
            System.out.println("The border element are");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i==0||j==0||j==n-1||i==m-1)

                        System.out.print("\t"+num[i][j]);
                    else
                        System.out.print("\t ");
                }
                System.out.println("");
            }
            System.out.println("mirror is");
            i=0;
            while (i < m) {
                j = 0;
                while (j < n) {
                    num1[i][n-1 - j] = num[i][j];
                    j = j + 1;
                }
                i = i + 1;
            } 
            ob.Display(num1,m,n);
            System.out.println("the diagonal elements are");
            i=0;
            while (i < m) {
                j = 0;
                while (j < n) {
                    if(i==j||(i+j+1)==n)

                        System.out.print("\t"+num[i][j]);
                    else
                        System.out.print(" \t");
                    j=j+1;
                }
                System.out.println("");
                i=i+1;
            }
        }
        else
            System.out.println("wrong input");
    }
}

