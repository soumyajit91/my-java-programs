package computer_project;

import java.util.*;
public class DDA_SORTING
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i,j,k,l,m,temp;
        System.out.println ("Enter the number of rows and columns : ");
        m=sc.nextInt();
        int ar[][]=new int[m][m];
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.println ("Enter "+(i+1)+ " row and "+(j+1)+" column elements : ");
                ar[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Original Matrix :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();                
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                for(k=0;k<m;k++)
                {
                    for(l=0;l<m;l++)
                    {
                        if (ar[i][j]>ar[k][l])
                        {
                            temp=ar[i][j];
                            ar[i][j]=ar[k][l];
                            ar[k][l]=temp;
                        }
                    }
                }
            }
        }
        System.out.println("Sorted Matrix :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print (ar[i][j]+"\t");
            }
            System.out.println();
        }
    }    
}