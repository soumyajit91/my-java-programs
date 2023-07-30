package computer_project;
import java.util.*;
class DiagonalSum
 {
public static void main() //main function 
{
int a[][]=new int[3][3];
 Scanner sc= new Scanner(System.in);
int x,y,z,sum=0;
 System.out.println("Enter the array");
for(x=0;x<3;x++) //Reading array
 {
for(y=0;y<3;y++)
 {
z=sc.nextInt();
 a[x][y]=z;
 }
}
 System.out.println("Array -");
for(x=0;x<3;x++)
{
for(y=0;y<3;y++)//displaying array
{
System.out.print(a[x ][y]+" ");
 }
 System.out.println();
}
y=0;
 for(x=0;x<3;x++)//loop for finding sum of diagonal
 {
sum=sum+a[x][y];
 y=y+1;
}
System.out.println("sum of diagonal"+sum);//displaying sum of diagonal 
sum=0;
}
}
