package others;
import java.util.*;
class datea
{
         static boolean isLeapYear(int y)
          {
              if((y%4==0&&y%100!=0)||y%400==0)
              return true;
              else
              return false;
            }
         public static void main()
          {
              int y=0;boolean c=false;
              datea ob=new datea();
              Scanner sc=new Scanner (System.in);
              System.out.println("Enter the no.of years to be stored");
              y=sc.nextInt();
              int array[]=new int[y];
              System.out.println("Enter the years to be check");
              for(int i=0;i<y;i++)
              array[i]=sc.nextInt();
              for(int i=0;i<y;i++)
              {
                  if(ob.isLeapYear(array[i])==true)
                    System.out.println(array[i]+"is a leap year");
                  else
                     System.out.println(array[i]+"is not a leap year");
                    }
            }
        }
            
            