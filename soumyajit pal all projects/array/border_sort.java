package array;

import java.util.*;
public class border_sort
       {
           public static void main()
           {
               Scanner sc=new Scanner(System.in);
               int i,j;
               System.out.println("
               int num[][]=new int[4][4];              
               System.out.println("the elements of 4*4 matrix are:");
               for(i=0;i<4;i++)
                 {
                     for(j=0;j<4;j++)
                     {
                         num[i][j]=sc.nextInt();
                        }
                    }
               System.out.println("The elements of4*4 matrix are:");
               for(i=0;i<4;i++)
                {
                    for(j=0;j<4;j++)
                    {
                        System.out.print(num[i][j]+"    ");
                    }
                    System.out.println();
                }
                System.out.println("The border elements are");
                for(i=0;i<4;i++)
                {
                    for(j=0;j<4;j++)
                    {
                        if(i==0||j==0||j==3||i==3)
                        
                            System.out.print(num[i][j]);
                            else
                            System.out.print(" ");
                    }
                     System.out.println("");
                }
                
        }
    }