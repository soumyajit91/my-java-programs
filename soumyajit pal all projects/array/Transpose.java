package array;
import java.util.*;
public class Transpose
       {
           public static void main()
           {
               Scanner sc=new Scanner(System.in);
               System.out.println("enter the row and column ");
               int n=sc.nextInt();
               int i,j;
               int num[][]=new int[n][n];
               int num1[][]=new int[n][n];
              
               System.out.println("the elements of  matrix are:");
               for(i=0;i<n;i++)
                 {
                     for(j=0;j<n;j++)
                     {
                         num[i][j]=sc.nextInt();
                        }
                    }
               System.out.println("The elements of matrix are:");
               for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print(num[i][j]+"    ");
                    }
                    System.out.println();
                }
                System.out.println("The transpose of the matrix:");
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        num1[j][i]=num[i][j];
                    }
                }
                for(i=0;i<n;i++)
                {
                    for(j=0;j<n;j++)
                    {
                        System.out.print(num1[i][j]+"    ");
                    }
               
                System.out.println();
            }
        }
    }
                
                        
                        

                        