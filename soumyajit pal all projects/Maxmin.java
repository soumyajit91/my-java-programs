import java.util.*;
class Maxmin
   {
       public static void main()
       {
           int i,j,max=0,min;
           int num[]= new int[10];
           Scanner in = new Scanner (System.in);
           System.out.println("Enter 10 different  numbers in the array");
           for(i=0;i<10;i++)
           {
               num[i]=in.nextInt();
            }
           max=num[0];
           min=num[0];
           for(j=0;j<10;j++)
           {
               if(max<num[j])
               max=num[j];
               if(min>num[j])
               min= num[j];
            }
           System.out.println("the greastest element of the array ="+max);
           System.out.println("the smallest element of the array ="+min);
        }
    }
           
 