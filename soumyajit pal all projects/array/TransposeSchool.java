package array;

import java.util.*;
public class TransposeSchool
       {
        int i,j,size;  
        int n1[][],n[][];
        
             void inputarray(int n7)
        {
            n= new int [n7][n7];
            n1= new int [n7][n7];
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter array");
            for( i=0;i<n7;i++)
            {
                 for(j=0;j<n7;j++)
                    {
                     
                n[i][j]=sc.nextInt();
               }
            }
           }
        void transpose(int n7)
        {
            TransposeSchool ob= new TransposeSchool();
            ob.inputarray(n7);
               ob.display(n7);
            System.out.println("The transpose of the matrix:");
                for(i=0;i<n7;i++)
                {
                    for(j=0;j<n7;j++)
                    {
                        n1[j][i]=n[i][j];
                    }
                }
                ob.display(n7);
            }
          
            void display(int n7)
        {
                 for(j=0;j<n7;j++)
                    {
                      
                for(int i=0;i<n7;i++)
                {   
                    System.out.println(n1[i][j]+"\n");
                }
            }
        }
        public static void main()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no. of elements of the matrix");
            int n= sc.nextInt();
            TransposeSchool ob= new TransposeSchool();
            
            
            ob.transpose(n);
           
        }
    }