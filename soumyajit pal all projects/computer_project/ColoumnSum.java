package computer_project;

import java.util.*;
class ColoumnSum
{
    public static void main() //main function 
    {
        int a[][]=new int[4][4];
        Scanner sc=new Scanner(System.in);
        int x,y,z,Sum=0;
        System.out.println("Enter the array"); //reading array 
        for(x=0;x<4;x++)
        {
            for(y=0;y<4;y++)
            {
                a[x][y]=sc.nextInt();
            }
        } 
        System.out.println("Array-"); //printing array in matrix form
        for(x=0;x<4;x++) 
        {
            for(y=0;y<4;y++)
            {
                System.out.print(a[x][y]+" ");
            }
            System.out.println();
        }
        for(y=0;y<4;y++)
        {
            for(x=0;x<4;x++)
            {
                Sum=Sum+a[x][y];
            }
            System.out.println("Sum of column"+(y=1)+"is"+Sum);
            Sum=0;
        }
    }
}
