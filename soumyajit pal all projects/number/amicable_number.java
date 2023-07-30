
             package number;
import java.util.*;
class amicable_number
 {
     static void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number ");
         int a =sc.nextInt();
         int b= sc.nextInt();
         int i,j,c=0,d=0;
         for(i=1;i<a;i++)
         {
             if(a%i==0)
             {
                 c=c+i;
                }
            }
          for(j=1;j<a;j++)
         {
             if(b%j==0)
             {  
                 d=d+j;
                }
            }
          if(c==b&&d==a)
         {
             System.out.println("amecable number");
            }
         else
         {
             System.out.println("not amecable number");
            }
        }
    }
  