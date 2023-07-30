package array;
import java.util.*;
public class corner
       {
           public static void main()
           {
               Scanner sc=new Scanner(System.in);
               int i,j;
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
                        System.out.print(num[i][j]+"\t");
                    }
                    System.out.println();
                }
                System.out.println("The corner elements are");
                for(i=0;i<4;i++)
                {
                    for(j=0;j<4;j++)
                    {
                        if((i==0&&j==0)||(j==3&&i==3)||(i==0&&j==3)||(i==3&&j==0))
                        
                            System.out.print(num[i][j]+"\t");
                            else
                            System.out.print("\t");
                    }
                     System.out.println();
                }
                
        }
    }