package array;
import java.util.Scanner;

public class JavaProgram
{
   public static void main(String args[])
   {
       int row, col, i, j,s=0;
       int arr[][] = new int[10][10];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Number of Row for Array (max 10) : ");
       row = scan.nextInt();
       System.out.print("Enter Number of Column for Array (max 10) : ");
       col = scan.nextInt();
         
       System.out.print("Enter " +(row*col)+ " Array Elements : ");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               arr[i][j] = scan.nextInt();
               s= s+arr[i][j];
           }
       }
	    

       System.out.print("The Array is :\n");
       for(i=0; i<row; i++)
       {
           for(j=0; j<col; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
       System.out.println("sum of array elements are "+ s);
       
   }
   
}