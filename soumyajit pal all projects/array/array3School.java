package array;
import java.util.*;
class array3School

 {
     void Double(int arry[])
     {
         for(int i=0;i<10;i++)
         {
             arry[i]=arry[i]*2;
            }
        }
     public static void main()
      {
         int arry1[]=new int[10];
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter array element");
         for(int i=0;i<10;i++)
         {
             arry1[i]=sc.nextInt();
            }
         array3School ob1=new array3School(); 
         ob1.Double(arry1);
         for(int i=0;i<10;i++)
         {
             System.out.println(arry1[i]);
            }
        }
    }